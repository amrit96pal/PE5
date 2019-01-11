package com.stackroute.pe5;
/**
 * Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
 * Modify and return the given map as follows:
 * a. If the key `val1` has a value, set the key `val2` to have that value, and
 * b. Set the key `val1` to have the value `"  "` (empty
 * string
 * ).
 * Example 1:
 * The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":
 * "java"}
 * Example 2:
 * The map {"val1": "mars", "val2": "saturn"}  should return {"val1": " ", "val2":
 * "mars"}
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ManipulationOfMaps {
    public Boolean manipulateMap(Map<String, String> map) {
        Iterator<String> itr=map.keySet().iterator();
        while(itr.hasNext()){
            String key1=itr.next();
            String key2=itr.next();
            if(map.get(key1)!=null){
                map.put(key2,map.get(key1));
                map.put(key1," ");
                break;
            }else {
                return false;
            }
        }
        return true;
    }
}
