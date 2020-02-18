package com.company;

public class ContactO {
    protected String name;
    protected Double phonenumber;
    protected String email;


    public  String getname(){ return name;}
    public void String setname(String name){this.name = name; }
    public  Double getphonenumber(){return phonenumber; }
    public void Double setphonenumber(Double phonenumber){this.phonenumber = phonenumber();}
    public String getemail(){ return email;}
    public void String setemail(String email){ this.email = email}


    ContactO(){
        name = null;
        phonenumber = null;
        email = null;
    }

    public ContactO( String name, Double phonenumber, String email){
        this.name = name;
        this.phonenumber = phonenumber;
        this.email = email;

    }


}