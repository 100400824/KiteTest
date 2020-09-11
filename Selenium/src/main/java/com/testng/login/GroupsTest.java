package com.testng.login;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {

    @Test(groups = "server")
    public void server1() {
        System.out.println("server1");
    }

    @Test(groups = "server")
    public void server2() {
        System.out.println("server2");
    }

    @Test(groups = "client")
    public void client1() {
        System.out.println("client1");
    }

    @Test(groups = "client")
    public void client2() {
        System.out.println("client2");
    }


    @BeforeGroups("server")
    public void server11() {
        System.out.println("berfore server");
    }

    @AfterGroups("server")
    public void server22() {
        System.out.println("after server");

    }
}
