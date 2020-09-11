package com.testng.login;

import org.testng.annotations.Test;

public class ThreadTest {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void threads() {

        System.out.println(1111);
        System.out.println("thread id is :" + Thread.currentThread().getId());
    }
}
