package top.lxyi.config;

import io.minio.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinioConfig {
    @Value("${minio.endPoint}")
    private String endPoint;
    @Value("${minio.accessKey}")
    private String accessKey;
    @Value("${minio.secretKey}")
    private String secretKey;

    private MinioClient instance;

@PostConstruct
    public void init(){
        instance= MinioClient.builder()
                .endpoint(endPoint)
                .credentials(accessKey,secretKey)
                .build();
    }
//    判断bucket是否存在
    private boolean bucketExists(String bucketName) throws Exception{
        return instance.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());
    }
//    创建bucket
    public void makeBucket(String bucketName) throws Exception{
        boolean flag = bucketExists(bucketName);
        if (!flag){
            instance.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
        }
    }
    /*文件上传*/
    public ObjectWriteResponse uploadObject(String bucketName,String objectName,String filePath) throws Exception{
        return instance.uploadObject(UploadObjectArgs.builder().bucket(bucketName).object(objectName).filename(filePath).build());
    }
    /*删除文件*/
    public void removeObject(String bucketName,String objectName) throws Exception {
        instance.removeObject(RemoveObjectArgs.builder().bucket(bucketName).object(objectName).build());
    }

}
