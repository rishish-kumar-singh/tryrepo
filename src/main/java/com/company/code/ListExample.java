package com.company.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListExample {

    public static void main(String[] args) {

        List<String>  list=new ArrayList<>();
        list.add("Ravi");
        list.add("Rahul");
        list.add("Ankur");
        list.add("Vinay");
        list.add("Roshan");

        //Iterate using lambda expression

        list.forEach((x)->{
            System.out.println(x.toUpperCase());
        });


    }

}
