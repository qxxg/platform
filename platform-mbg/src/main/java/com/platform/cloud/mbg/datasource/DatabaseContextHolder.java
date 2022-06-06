package com.platform.cloud.mbg.datasource;

import lombok.extern.slf4j.Slf4j;

/**
 * @author:SmallSand
 * @Date:Created in 2019/8/21
 */
@Slf4j
public class DatabaseContextHolder {

    //线程本地环境
    private static final ThreadLocal<String> local = new ThreadLocal<>();

    public static ThreadLocal<String> getLocal() {
        return local;
    }

    /**
     * 读库
     */
    public static void setRead() {
        local.set(DatabaseType.read.getType());
        log.debug("数据库切换到读库...");
    }

    /**
     * 写库
     */
    public static void setWrite() {
        local.set(DatabaseType.write.getType());
        log.debug("数据库切换到写库...");
    }

    public static String getReadOrWrite() {
        return local.get();
    }

    public static void clear(){
        local.remove();
    }

}
