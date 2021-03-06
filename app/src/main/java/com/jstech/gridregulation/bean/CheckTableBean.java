package com.jstech.gridregulation.bean;

import java.io.Serializable;

public class CheckTableBean implements Serializable {

    /**
     * id : 51a83f55ef89426699ca7888cf931f10
     * name : 测试1
     * num : 2
     * type : 测试
     */

    private String id;
    private String name;
    private int num;
    private String type;
    private boolean isSelected;

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
