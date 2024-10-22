package com.demo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IllegalAccessException, InvocationTargetException {
        UserInfo userInfo = new UserInfo("Arpit Kumar", "ak2400320@gmail.com");

        Field[] declaredFields = userInfo.getClass().getDeclaredFields();

        for(Field field : declaredFields) {
            if(field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(userInfo, "Arpit Kumar Singh");
            }
        }

//        System.out.println("Name : " + userInfo.getName());

        Method[] declaredMethods = userInfo.getClass().getDeclaredMethods();

        for(Method method : declaredMethods) {
            if(method.getName().equals("printUserInfoPublic")) {
                method.invoke(userInfo);
            } else if(method.getName().equals("printUserInfoPrivate")) {
                method.setAccessible(true);
                method.invoke(userInfo);
            } else if(method.getName().equals("printUserInfoPublicStatic")) {
                method.invoke(userInfo);
            } else if(method.getName().equals("printUserInfoPrivateStatic")) {
                method.setAccessible(true);
                method.invoke(null);
            }
            System.out.println("Method : " + method.getName());
        }
    }
}
