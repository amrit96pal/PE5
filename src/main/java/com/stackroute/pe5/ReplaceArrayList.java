package com.stackroute.pe5;
/**
 * Write a Java program to update specific array element by given element and empty the
 * array list
 * .
 * Input: [Apple, Grape, Melon, Berry]
 * Output: [Kiwi, Grape, Mango, Berry]
 * Array list
 *  after removing all elements []
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceArrayList {
    public Boolean replaceArrayList(List<String> inp){
        if(inp.size()!=0){
            inp.remove(2);
            inp.remove(0);
            inp.add(0,"Kiwi");
            inp.add(2,"Mango");
            return true;
        }else {
            return false;
        }
    }

}
