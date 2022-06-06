package com.platform.cloud.mbg.datasource;

/**
 * @author:SmallSand
 * @Date:Created in 2019/8/21
 */
public enum DatabaseType {
    read("read", "从库"),
    write("write", "主库");

    private String type;

    private String name;

    DatabaseType(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

