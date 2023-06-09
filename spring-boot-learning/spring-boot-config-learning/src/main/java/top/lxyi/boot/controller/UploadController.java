package top.lxyi.boot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.lxyi.boot.service.UploadService;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class UploadController {
    private final UploadService uploadService;
    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file){
        return uploadService.ossUpload(file);
    }

}
