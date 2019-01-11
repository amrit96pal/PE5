package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ManipulationOfMapsTest {
    ManipulationOfMaps map;

    @Before
    public void setUp() throws Exception {
        map=new ManipulationOfMaps();
    }

    @After
    public void tearDown() throws Exception {
        map=null;
    }

    @Test
    public void mainSuccess() {
        Map<String,String> map1=new HashMap<String, String>();
        map1.put("Val1","amrit");
        map1.put("Val2","pal");
        assertEquals(true,map.manipulateMap(map1));
    }

    @Test
    public void mainSuccessFailure() {
        Map<String,String> map1=new HashMap<String, String>();
        map1.put("Val1","amrit");
        map1.put("Val2","pal");
        assertNotEquals(false,map.manipulateMap(map1));
    }

    @Test
    public void mainSuccessNull() {
        Map<String,String> map1=new HashMap<String, String>();
        map1.put("Val1",null);
        map1.put("Val2","pal");
        assertEquals(false,map.manipulateMap(map1));
    }

}