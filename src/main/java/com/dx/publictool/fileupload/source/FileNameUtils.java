package com.dx.publictool.fileupload.source;

public class FileNameUtils {

    /**
     * 获取文件后缀
     * @param fileName
     * @return
     */
    public static String getSuffix(String fileName){
        return fileName.substring(fileName.lastIndexOf("."));
    }

    public static String getFileName(String fileOriginName, String uploadUser){
        return SerialNameUtils.getSerialName(uploadUser) + FileNameUtils.getSuffix(fileOriginName);
    }

}
