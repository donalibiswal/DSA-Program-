package com.donali;

public class conditionals {
    public static void main(String[] args) {

        //if statement
        int salary = 90000;
        if(salary > 50000){
            salary = salary + 2000;
        }
        else {
            salary = salary + 1000;
        }
        System.out.println(salary);


        //multiple if-else
        if(salary > 10000){
            salary += 2000;
        }
        else if (salary > 20000){
            salary += 1000;
        }
        System.out.println(salary);
    }
}
