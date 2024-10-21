package com.example.customlistview;

public class Phone {
    private String namephone;
    private int imgphone;

    public Phone(int imgphone, String namephone) {
        this.imgphone = imgphone;
        this.namephone = namephone;
    }

    public int getImgphone() {
        return imgphone;
    }

    public void setImgphone(int imgphone) {
        this.imgphone = imgphone;
    }

    public String getNamephone() {
        return namephone;
    }

    public void setNamephone(String namephone) {
        this.namephone = namephone;
    }
}
