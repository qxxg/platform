package com.platform.cloud.mbg.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author:SmallSand
 * @Date:Created in 2019/8/21
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    private final int dataSourceNumber;

    private AtomicInteger count = new AtomicInteger(0);


    public DynamicDataSource(int dataSourceNumber) {
        this.dataSourceNumber = dataSourceNumber;
    }


    @Override
    protected Object determineCurrentLookupKey() {
        String typeKey = DatabaseContextHolder.getReadOrWrite();

        if(typeKey == null){
            throw new NullPointerException("数据库路由时，决定使用哪个数据库源类型不能为空...");
        }

        if (typeKey.equals(DatabaseType.write.getType())) {
            System.err.println("使用数据库write.............");
            return DatabaseType.write.getType();
        }

        // 读 简单负载均衡
        int number = count.getAndAdd(1);
        int lookupKey = number % dataSourceNumber;
        System.out.println("切换到读："+lookupKey+"库......");
        return new Integer(lookupKey);
    }
}
