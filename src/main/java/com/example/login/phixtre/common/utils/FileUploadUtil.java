package com.example.login.phixtre.common.utils;

import lombok.extern.log4j.Log4j;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Description 文件上传
 * @Author WTL
 * @Date 2019/10/27
 **/
@Log4j
public class FileUploadUtil {

    /**
     * 单文件上传
     *
     * @param file
     * @return
     */
    public Boolean upload(MultipartFile file) {
        if (file.isEmpty()) {
            return false;
        }
        String fileName = file.getOriginalFilename();
        String filePath = "/user/var/workspace/temp/";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 多文件上传
     *
     * @param request
     * @return
     */
    public String multiUpload(HttpServletRequest request) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("files");
        String filePath = "/user/var/workspace/temp/";
        for (int i = 0; i < files.size(); i++) {
            MultipartFile file = files.get(i);
            if (file.isEmpty()) {
                return "第" + (++i) + "个文件上传失败！";
            }
            String fileName = file.getOriginalFilename();
            File dest = new File(filePath + fileName);
            try {
                file.transferTo(dest);
                return "第" + (++i) + "个文件上传成功！";
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "第" + (++i) + "个文件上传失败！";
        }
        return "上传成功！";
    }
}
