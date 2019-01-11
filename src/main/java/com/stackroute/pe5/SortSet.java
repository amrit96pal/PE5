package com.stackroute.pe5;
/**
 * Write a program to implement set interface which sorts the given randomly ordered names in
 * ascending order
 * . Convert the sorted set in to an
 * array list
 * Input : Harry  Olive  Alice  Bluto  Eugene
 * Output :
 * Sorted Set :  Alice  Bluto  Eugene  Harry  Olive
 * Array list
 *  from Set :  Alice Bluto Eugene Harry Olive
 */

import java.util.*;

public class SortSet {
    public Boolean SortTheWords(String[] pass) {
        if(pass.length!=0){
        Set<String> answer=new TreeSet<String>();
        List<String> list= new ArrayList<String>();
        for(int i=0;i<pass.length;i++){
            answer.add(pass[i]);
        }
        Iterator<String> itr=answer.iterator();
        while (itr.hasNext()){
            String temp=itr.next();
            list.add(temp);
        }
        return true;
    }else {
        return false;
        }
    }

}
