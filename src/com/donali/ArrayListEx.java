package com.donali;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(1);
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(15);
//        list.add(16);
//        System.out.println(list.contains(90));
//
//        list.set(0, 99);
//        list.remove(2);
//        System.out.println(list);


        //input
        for(int i=0; i < 5; i++){
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i =0; i < 5; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);

    }
}
