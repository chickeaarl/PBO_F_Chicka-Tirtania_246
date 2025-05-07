package com.praktikum.users;

abstract public class User{
    protected String name;
    protected String nim;
    protected String password;
    protected String alamat;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNim(){ return nim; }
    public void setNim(String nim) { this.nim = nim; }
    public String getPassword(){ return password; }
    public void setPassword(String password) { this.password = password; }

    public abstract boolean login(String input1, String input2);
    public abstract void displayInfo();

    public abstract void displayAppMenu(java.util.Scanner scanner);
}