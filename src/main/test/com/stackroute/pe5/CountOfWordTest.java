package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOfWordTest {
    CountOfWord coun;

    @Before
    public void setUp() throws Exception {
        coun=new CountOfWord();
    }

    @After
    public void tearDown() throws Exception {coun=null;
    }

    @Test
    public void calNumOfTimesSuccess() {
        assertEquals(true,coun.calNumOfTimes("one two one"));
    }


    @Test
    public void calNumOfTimesFailure() {
        assertNotEquals(false,coun.calNumOfTimes("one two one"));
    }

    @Test
    public void calNumOfTimesNull() {
        assertNotEquals(false,coun.calNumOfTimes(""));
    }



}