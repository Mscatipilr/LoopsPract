package com.win.junit;

import java.util.ArrayList;
import java.util.Scanner;

/* Create a class called "com.win.junit.LastItem" that takes user inputs of
strings until the user enters an empty string. Once the user enters
an empty string then it tells the
user what the last string in the list was and the program ends.
 */
public class LastItem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<String>();
        while (true) {
            String input = in.nextLine();
            if (input.isEmpty()) {
                System.out.println(lastItem(listOfStrings));
                break;
            }
            listOfStrings.add(input);

        }

    }
    public static String lastItem(ArrayList<String> listOfStrings) {
        int length = listOfStrings.size() - 1;
        return "The last item in the list is: " + listOfStrings.get(length) ;
    }
}
