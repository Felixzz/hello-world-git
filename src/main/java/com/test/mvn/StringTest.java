package com.test.mvn;

/**
 * Created by Felix on 15/12/14.
 */
public class StringTest {

    public static void main(String[] args) {
        String str = "abc";
        for (int i = 0; i < 10; i++) {
            str = str + "i";
        }
        System.out.println(str);
    }
}
