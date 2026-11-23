package com.being_infinity.springboot_beginner_cohort_3.models;

public class User{
    private int id;
    private String name;
    private String gender;
    private String image;

    public User(){

    }

    public User(int id,String name,String gender,String image){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.image=image;
    }
    public User(Object object, Object object2, Object object3, Object object4) {
        //TODO Auto-generated constructor stub
    }

    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image=image;
    }

}