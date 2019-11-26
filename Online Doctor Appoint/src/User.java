/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
class User {
    private int id;
    private String name,contact,gender,birth;
    

public User(int id, String name,String contact,String gender, String birth){
this.name=name;
this.contact=contact;
this.gender=gender;
this.birth=birth;
this.id=id;

}
public int getId(){
    return id;}
public String getName(){
 
    return name;}
public String getContact(){
 
    return contact;}
public String getGender(){
 
    return gender;}
public String getBirth(){
 
    return birth;}






}



