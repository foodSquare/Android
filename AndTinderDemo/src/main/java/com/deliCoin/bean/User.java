package com.deliCoin.bean;

/**
 * Created by RUTH on 15/11/02.
 */
public class User {
    private String id;
    private String birthday;
    private String gender;
    private String email;
    private String name;
    private String countLogin;

    static User instance = null;

    // Private constructor prevents instantiation from other classes
    private User() {}

    public static User getInstance() {
        if(instance == null) {
            instance = new User();
        }
        return instance;
    }

    public void init(String id, String birthday,String gender,String email,String name)
    {
        this.id = id;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.name = name;
        this.countLogin = countLogin;
    }

    public String toString()
    {
        return "id:"+this.id+",name:"+this.name+",email:"+this.email+",gender:"+this.gender+
                ",birthday:"+this.birthday+",countLogin"+countLogin;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountLogin() {
        return countLogin;
    }

    public void setCountLogin(String countLogin) {
        this.countLogin = countLogin;
    }
}
