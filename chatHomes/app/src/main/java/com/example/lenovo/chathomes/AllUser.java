package com.example.lenovo.chathomes;

/**
 * Created by Lenovo on 2/27/2018.
 */

public class AllUser {
    public String user_name,user_image,user_status,user_thumbs_image;

    public AllUser()
    {

    }

    public AllUser(String user_name, String user_image, String user_status,String user_thumbs_image) {
        this.user_name = user_name;
        this.user_image = user_image;
        this.user_status = user_status;
        this.user_thumbs_image=user_thumbs_image;
    }

    public String getUser_thumbs_image() {
        return user_thumbs_image;
    }

    public void setUser_thumbs_image(String user_thumbs_image) {
        this.user_thumbs_image = user_thumbs_image;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }
}
