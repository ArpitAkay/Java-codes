package com.demo;

public class UserInfo {
    private final String name;
    private String email;

    public UserInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printUserInfoPublic() {
        System.out.println("This is public method");
    }

    private void printUserInfoPrivate() {
        System.out.println("This is private method");
    }

    public static void printUserInfoPublicStatic() {
        System.out.println("This is public static method");
    }

    private static void printUserInfoPrivateStatic() {
        System.out.println("This is private static method");
    }
}
