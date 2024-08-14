package com.win.junit;/* takes user inputs of strings until the user enters an
empty string. Once the user enters an empty string then it tells the user what the fifth string in the list was and the program ends.
 */
//read user inputs
import java.util.ArrayList;
import java.util.Scanner;
public class FifthItem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<String>();

        while (true) { //while (in.hasNextLine()) {
            String input = in.nextLine();
            if (input.isEmpty()) {
                System.out.println(fifthItem(listOfStrings));
                break;
            }
            listOfStrings.add(input);

        }
    }
    public static String fifthItem(ArrayList<String> listOfStrings) {
        return "The fifth item in the list is: " + listOfStrings.get(4);
    }

}
