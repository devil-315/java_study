package com.devil03;

/**
 * ClassName：User
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class User {
    private String name;
    private int age;

    public int id;
    public String password;

    private User() {
    }

    public User(String name, int age, int id, String password) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void show(){

    }
    private void play(){

    }

    private void play2(String name){

    }
}
