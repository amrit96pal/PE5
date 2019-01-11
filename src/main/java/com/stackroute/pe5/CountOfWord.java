package com.stackroute.pe5;
/**
 * Write a program to find the number of counts in the following
 * String
 * . Store the output in
 * Map<
 * String
 * ,Integer> as key value pair
 * .
 * Input :
 * String
 *  str = “one one -one___two,,three,one @three*one?two”;
 * Output : {"one":5 , "two":2, "three" :2}
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOfWord {

    public Boolean calNumOfTimes(String inp) {

        Map<String,Integer> map=new HashMap<>();
        Set<String> set=new HashSet<String>();

        Pattern pat= Pattern.compile("[A-Za-z]*");
        Matcher matc=pat.matcher(inp);
        while (matc.find()){
            set.add(matc.group());
        }

        for(String num:set){

            Pattern p= Pattern.compile(num);
            Matcher mat=p.matcher(inp);
            int count=0;
            while (mat.find()){
                ++count;

            }
            map.put(num,count);
        }
        return true;
    }

}
