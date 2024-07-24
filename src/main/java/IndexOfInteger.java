import java.util.ArrayList;
import java.util.Scanner;

/*
Take user inputs of integers until user enters zero. Once the user enters zero
then the program tells the user they are done adding integers to the list.
The program will then ask the user what number they are looking for in the
list and tell them the index of that number.
 */
public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                System.out.println("Done entering integers into the list");
                break;
            }
            list.add(n);

        }
        System.out.println("What number are you looking for in the list?");
        int num = in.nextInt();
        System.out.println(num + " is at index " + list.indexOf(num));
    }
}
