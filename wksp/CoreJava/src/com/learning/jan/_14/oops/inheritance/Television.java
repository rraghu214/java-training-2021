package com.learning.jan._14.oops.inheritance;

public class Television {
    private String id;
    private String desc;
    private String type;

    public Television(String id, String desc, String type) {
        this.id = id;
        this.desc = desc;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

