package com.test.mvn;
/**
 * HelloWorld
 * Created by Felix on 15/12/9.
 */
public class HelloWorld {

    public String sayHello() {
        return "Hello World";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().sayHello());
    }
}
