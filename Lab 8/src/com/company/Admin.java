package com.company;

public class Admin extends User{

    private String admin_name ;
    private String email ;

    public Admin(String UserId, String Password, String admin_name, String email){
        super(UserId,Password);
        this.admin_name = admin_name;
        this.email = email;
    }



    public void update_catalog(){
        //error 404, file exits
    }
    public String getEmail(){
        return email;
    }
    public String getAdmin_name(){
        return admin_name;
    }
}
