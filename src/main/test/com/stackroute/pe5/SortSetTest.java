package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSetTest {
    SortSet sort;

    @Before
    public void setUp() throws Exception {
        sort= new SortSet();
    }

    @After
    public void tearDown() throws Exception {
        sort=null;
    }

    @Test
    public void sortTheWordsSuccess() {
        String[] arr={"amrit","pal","singh","stack","route"};
        assertEquals(true,sort.SortTheWords(arr));
    }

    @Test
    public void sortTheWordsFailure() {
        String[] arr={"amrit","pal","singh","stack","route"};
        assertNotEquals(false,sort.SortTheWords(arr));
    }

    @Test
    public void sortTheWordsNull() {
        String[] arr={};
        assertEquals(false,sort.SortTheWords(arr));
    }

}