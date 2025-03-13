package com.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {
    public static void main(String[] args) {

        List<Integer> mylist =  new ArrayList<>();
        mylist.add(10);
        mylist.add(6);
        mylist.add(3);
        mylist.add(8);
        mylist.add(1);

        Collections.sort(mylist);
        System.out.println(mylist);

        System.out.println("_______________________-");
        Collections.sort(mylist, Collections.reverseOrder());
        System.out.println(mylist);
    }
}
