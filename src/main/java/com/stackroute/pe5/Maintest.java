package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Maintest {

    public static void main(String[] args){
        List<Student> stud=new ArrayList<Student>();
        Student object1= new Student();
        object1.setAge(34);
        object1.setId(1);
        object1.setName("Amrit");
        Student ob2= new Student();
        ob2.setAge(44);
        ob2.setId(2);
        ob2.setName("Guri");
        Student ob3= new Student();
        ob3.setAge(22);
        ob3.setId(3);
        ob3.setName("Lavi");
        Student ob4= new Student();
        ob4.setAge(74);
        ob4.setId(4);
        ob4.setName("Chandini");
        Student ob5= new Student();
        ob5.setAge(74);
        ob5.setId(5);
        ob5.setName("Chandini");
        stud.add(object1);
        stud.add(ob2);
        stud.add(ob3);
        stud.add(ob4);
        stud.add(ob5);
        Collections.sort(stud,new StudentSorter());
    }
}
