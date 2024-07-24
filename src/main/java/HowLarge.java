import java.util.ArrayList;
import java.util.Scanner;
/* User inputs strings until the user enters an empty string.
Once the user enters an empty string then it tells the user
how large the list was and the program ends.
 */
public class HowLarge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<String>();
        while (true) { //while (in.hasNextLine()) {
            String input = in.nextLine();
            if (input.isEmpty()) {
                int length = listOfStrings.size() - 1;
                System.out.println("The total amount of items in the list was: " + length);
                break;
            }
            listOfStrings.add(input);

        }
    }
}
