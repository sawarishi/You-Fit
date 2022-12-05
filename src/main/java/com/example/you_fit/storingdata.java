package com.example.you_fit;

public class storingdata {

    String name,  username, email, phonenum, password;

    public storingdata() {
    }

    public storingdata(String name, String username, String email, String phonenum, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.phonenum = phonenum;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
