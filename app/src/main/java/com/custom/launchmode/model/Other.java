package com.custom.launchmode.model;

/**
 * Created by: Ysw on 2020/4/12.
 */
public class Other {
    private String name;

    public Other(String name) {
        this.name = name;
    }

    public Other() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Other{" +
                "name='" + name + '\'' +
                '}';
    }
}
