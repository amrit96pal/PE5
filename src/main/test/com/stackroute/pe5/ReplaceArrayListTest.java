package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReplaceArrayListTest {
    ReplaceArrayList rep;

    @Before
    public void setUp() throws Exception {
        rep=new ReplaceArrayList();
    }

    @After
    public void tearDown() throws Exception {
        rep=null;
    }

    @Test
    public void replaceArrayListSuccess() {
        List<String> inp=new ArrayList<String>(Arrays.asList("Apple","Grape","Melon","Berry"));
        assertEquals(true,rep.replaceArrayList(inp));
    }

    @Test
    public void replaceArrayListFailure() {
        List<String> inp=new ArrayList<String>(Arrays.asList("Apple","Grape","Melon","Berry"));
        assertNotEquals(false,rep.replaceArrayList(inp));
    }


    @Test
    public void replaceArrayListNull() {
        List<String> inp=new ArrayList<String>(Arrays.asList());
        assertEquals(false,rep.replaceArrayList(inp));
    }
}