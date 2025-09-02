package com.donali;

public class Arrays {
    public static void main(String[] args) {
        //syntax
        //datatype[] variable_name = new datatype[size];

      //  int[] rnos = new int[5];
        //or directly
      //  int[] rnos2 = {23, 12, 45, 32, 15};

//        int[] ros ;  //declaration of array. ros is getting defined in the stack
//        ros = new int[5];  //initialisation : actually here object is being created in the memory(heap memory)
//        System.out.println(ros[1]);  //output : 0 (by default 0 becoz we didn't assign any value)


        String[] arr = new String[5];
        System.out.println(arr[0]); //output : null (by default null value)

    }

}
