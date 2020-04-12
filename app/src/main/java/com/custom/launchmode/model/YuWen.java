package com.custom.launchmode.model;

/**
 * Created by: Ysw on 2020/4/12.
 */
public class YuWen {
    private String name;

    public YuWen(String name) {
        this.name = name;
    }

    public YuWen() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "YuWen{" +
                "name='" + name + '\'' +
                '}';
    }
}
