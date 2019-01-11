package com.stackroute.pe5;

import java.util.*;

public class StudentSorter implements Comparator<Student> {

    public int compare(Student first, Student sec){
        if(!first.getName().equals(sec.getName())){
            return first.getName().compareTo(sec.getName());
        }else if(first.getAge()!=sec.getId()){
            return sec.getAge()-first.getAge();
        }
        else {
            return sec.getId()-first.getId();
        }
    }
}
