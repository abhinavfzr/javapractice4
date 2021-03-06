package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortStringTest {
    SortString app;
    @Before
    public void setUp() throws Exception {
        app= new SortString();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }

    @Test
    public void sortString() {
    }

    @Test
    public void test3() throws Exception {
        //Arrange
        String[] expectedValue = {"abhinav", "anand", "gopal"};

        //Act
        String[] actualValue = app.sortString("gopal anand abhinav");
        //Assert
        assertArrayEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}