package com.win.junit;

import java.util.ArrayList;
import java.util.Scanner;

/*
Create a class called "com.win.junit.SumOfList"  that takes user inputs of integers until the user enters
zero and sums them together.  Create a list in your main method and add as many items as the
user would like to the list. Call the method that gets the
sums and print the result of the method's calculation to the console (any numeric data type).
 */
public class SumOfList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            int n = in.nextInt();
            if (n == 0){

                break;
            }
            list.add(n);
        }
        for (Integer num : list){
            System.out.println(num);
        }
        System.out.println("The sum of that list is: " + sumOfList(list));
    }
    public static int sumOfList(ArrayList<Integer> list){
        int sum = 0;
        for (Integer num : list){
            sum += num;
        }
        return sum;
    }
}
