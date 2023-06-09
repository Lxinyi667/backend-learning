package top.lxyi.controller;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class FileUploadController {
    //    单独注入
    @Value("${web.upload-path}")
    private String uploadPath;
    @Value("${minio.endPoint}")
            private String endPoint;
    @Value("${minio.accessKey}")
    private String accessKey;
    @Value("${minio.secretKey}")
    private String secretKey;
    DateFormat df = new SimpleDateFormat("yyyyMMdd");
    private MinioClient instance;

    @PostMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest request) throws IOException {
        //创建子目录,实现了在 uploadPath 目录中通过日期对上传的文件归类保存
        String format = df.format(new Date());
        /*指向*/
        File folder = new File(uploadPath+ format );
        if (!folder.isDirectory()){
            folder.mkdirs();
        }
        //对上传的文件重命名，避免冲突
            //首先获取到源文件的扩展名1.1.jpg (jpg获取出来的)
        String oldName = file.getOriginalFilename();
        String newName = null;
        if (oldName != null){
            newName = UUID.randomUUID()
                    +oldName.substring(oldName.lastIndexOf("."));

        }
        //上传:文件复制搬运
        file.transferTo(new File(folder,newName));
        //拼接返回上传后的访问路径
//        http://localhost:8090/20230410/443kasadsjefssfd.jpg
//        得到一个接口
        return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/" +format + newName;


    }
    @PostConstruct
    public void init(){
        instance= MinioClient.builder()
                .endpoint(endPoint)
                .credentials(accessKey,secretKey)
                .build();
    }
    /*
    * 判断Bucket是否存在
    * */
    public boolean bucketExists(String bucketName) throws Exception {
        return instance.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());
    }
    public void makeBucket(String bucketName) throws Exception{
        boolean flag = bucketExists(bucketName);
        if (!flag){
            instance.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
        }
    }
}
