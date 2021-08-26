package com.Vijay;

public class Contacts {

    // Suppose this is a object

    // vijay -> 2000

    static String collegeName = "College"; // 7 bit Random access memory
    String name;
    private String number;
    private String password;

    public Contacts(String name, String number) {
        this.name = addMisterInBeginning(name);
        this.number = number;
    }

    private String addMisterInBeginning(String name) {

        String newName = "Mr. " + name;
        return newName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

