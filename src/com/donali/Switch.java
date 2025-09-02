package com.donali;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        switch (fruit){
//            case "mango" -> System.out.println("king of fruit");
//            case "Apple" ->  System.out.println("sweet red fruit");
//            case "orange" -> System.out.println("round fruit");
//            case "Grapes" ->   System.out.println("small fruit");
//            default -> System.out.println("plz enter a valid no");
//        }


//        int day = in.nextInt();
//        switch (day){
//            case 1,2,3,4,5 -> System.out.println("weekday");
//            case 6,7 -> System.out.println("weekend");
//        }

        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Donali Biswal");
            case 2 -> System.out.println("Rinu");
            case 3 -> {
                System.out.println("Donali Biswal");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "management" -> System.out.println("management department");
                    default -> System.out.println("no department entered");
                }
            }
            default -> System.out.println("enter correct emailid");
        }
    }
}