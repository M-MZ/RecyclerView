package com.example.dell.helloworld;

public class Version {

    private String name;
    private String description;
    private String icon;

    public Version(String name, String description, String icon) {
        this.name = name;
        this.description = description;
        this.icon = icon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }
}
