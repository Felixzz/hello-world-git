package com.test.mvn;

/**
 * Created by Felix on 15/12/14.
 */
public class Test {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "b";
        String str3 = str1 + str2;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        //误写入master上的提交
        System.out.println(str3);
        //需要保存的提交
        System.out.println(str1);
        //需要保存的提交2
        System.out.println(str1);
    }
}
