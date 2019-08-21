package com.dc.tasksend.controller;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author duanchao
 * @CreateDate: 2019/8/20 0020 16:43
 */
@RestController
@RequestMapping("/image")
public class ImageController {

    private  static  final String accessKey = "WgKETI0k4Twyt2MC8vlRHiomput_Ul4fWrVF9OLN";
    private  static  final  String secretKey = "ZDDqVWxaZ-d8TkmKShL7hy7pQZfCpEsfYSsKbp1n";
    private  static  final  String bucket = "image_public";

    private  static  final  String fix_url= "http://pwj6kl7y0.bkt.clouddn.com/";

    @PostMapping("/upload")
    public  String upload(@RequestParam("file") MultipartFile file) throws IOException {
        if(null==file){
            return "图片为空！";
        }
        String fileName = file.getOriginalFilename();
        String suffixName  = fileName.substring(fileName.lastIndexOf("."));
        fileName = UUID.randomUUID().toString().replace("-","")+suffixName;

        File dest = new File("/root/image/"+fileName);

        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        file.transferTo(dest);
        return "chengg1";

    }


    @GetMapping("/get/token")
    public  String grtToken(){

        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        System.out.println(upToken);
        return upToken;
    }


    @GetMapping("/get/url")
    public  String getUrl (String path) throws QiniuException {

        Configuration cfg = new Configuration(Zone.zone0());

        UploadManager uploadManager = new UploadManager(cfg);

        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);

        Response response = uploadManager.put(path, null, upToken);
        DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
        System.out.println(putRet.key);
        System.out.println(putRet.hash);

        return fix_url+putRet.key;
    }
}
