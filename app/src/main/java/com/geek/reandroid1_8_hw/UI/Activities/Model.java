package com.geek.reandroid1_8_hw.UI.Activities;

public class Model {
    private String name, secName, type;
    private int image, num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Model(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public Model(String name, String secName, String type) {
        this.name = name;
        this.secName = secName;
        this.type = type;
    }

    public Model(String name, String secName, String type, int image) {
        this.name = name;
        this.secName = secName;
        this.type = type;
        this.image = image;
    }
}
