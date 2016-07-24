package com.test.mvn;

/**
 * Created by Felix on 15/12/17.
 */
public class FinallyTest {

    static int test() {
        int x = 1;
        try {
            x++;
            return x;
        } finally {
            ++x;
        }
    }

    static void test2() {
        throw new RuntimeException();
    }

    static int test1() {
        int x = 1;
        try {
            x++;
            test2();
            x++;
            return x;
        } catch (Exception e) {
            x++;
            e.printStackTrace();
        } finally {
            ++x;
            return x;
        }
    }

    public static void main(String[] args) {
        System.out.println(test1());
    }


}