package com.stackroute.pe5;
/**
 * Write a program where an array of strings is input and output is a Map<
 * String
 * ,boolean> where
 * each dif
 * ferent
 * string
 *  is a key and its value is true if that
 * string
 *  appears 2 or more times in the array
 * Input :
 * String
 *  arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
 * Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccurenceOFString {
    public Boolean findNumOfOccurence(String[] str) {
        if(str.length!=0){
            Map<String,Integer> map= new HashMap<String, Integer>();
            for(int j=0;j<str.length;j++){
                int count=0;
                String str1=str[j];
                for(int i=0;i<str.length;i++){
                    if(str[i].equals(str1)){
                        count++;
                    }
                }
                if(count>=2){
                    map.put(str1,count);
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
