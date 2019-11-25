package com.qxxg.springcloud.platformcommon.util;

import org.springframework.util.DigestUtils;

/**
 * @Author: smallsand
 * @Date: 2019/11/23 15:12
 */
public class MD5Util {

    //盐，用于混交md5
    private static final String slat = "&%5123***&&%%$$#@";

    public static String getMD5(String str) {
        String base = str +"/"+slat;
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }

}
