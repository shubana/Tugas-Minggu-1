package com.company;

public class User {

    private String UserId ;
    private String Password ;
    private boolean Login_status;

    public User(String UserId, String Password) {
        this.UserId = UserId;
        this.Password = Password;
    }

    public boolean verifyLogin(String Password){
    Login_status = this.Password.equals(Password);
    return Login_status;
    }

    public String getUserId(){
        return UserId;
    }

    public String getPassword(){
        return Password;
    }
}
