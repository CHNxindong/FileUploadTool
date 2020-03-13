package com.dx.publictool.fileupload.source;

import java.util.Date;

/**
 * @author CHNxindong
 * @date 2020/3/13 11:53
 */
public class SerialNameUtils {
    public static String getSerialName(String uploadUser){
        return uploadUser + "_" +new Date().toString().replace(" ", "_").replace(":", "_");
    }
}
