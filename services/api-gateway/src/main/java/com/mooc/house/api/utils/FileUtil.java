package com.mooc.house.api.utils;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

import org.springframework.web.multipart.MultipartFile;

import com.google.common.io.Files;

public class FileUtil {


    /**
     * 上传文件到本地服务器
     * @param file
     * @param filePath
     * @return
     * @throws IOException
     */
  public static File saveToLocal(MultipartFile file, String filePath) throws IOException {
    
    File newfile =   new File(filePath+"/"+Instant.now().getEpochSecond()+"/"+file.getOriginalFilename());
    if (!newfile.exists()) {
         newfile.getParentFile().mkdirs();
         newfile.createNewFile();
    }
    Files.write(file.getBytes(), newfile);
    return newfile;
  }

}
