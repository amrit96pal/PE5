package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceOFStringTest {
    OccurenceOFString occ;

    @Before
    public void setUp() throws Exception {
        occ=new OccurenceOFString();
    }

    @After
    public void tearDown() throws Exception {
        occ=null;
    }

    @Test
    public void findNumOfOccurenceSuccess() {
        String[] arr={"a","a","b","b","c"};
        assertEquals(true,occ.findNumOfOccurence(arr));
    }

    @Test
    public void findNumOfOccurenceFailure() {
        String[] arr={"a","a","b","b","c"};
        assertNotEquals(false,occ.findNumOfOccurence(arr));
    }


    @Test
    public void findNumOfOccurenceNull() {
        String[] arr={};
        assertEquals(false,occ.findNumOfOccurence(arr));
    }
}