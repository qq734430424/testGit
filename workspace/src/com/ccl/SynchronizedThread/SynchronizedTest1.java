package com.ccl.SynchronizedThread;
/**
 * Created by cuichenglong on 2017/9/5.
 */
public class SynchronizedTest1 {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("Hello~")).start();


        System.out.println("show some changes");
    }

}
