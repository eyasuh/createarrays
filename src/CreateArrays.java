import java.util.Scanner;
import java.util.Arrays;

public class CreateArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // declare and initialize
        int [] intArr = {1, 21, 63, 4, 51};
        String [] strArr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Fridat", "Saturday"};
        char charArr [] =  {'a', 'e', 'i', 'o', 'u'};
        Boolean [] bool = {true, false};
        // print the content of array
        System.out.println("Numbers: " + Arrays.toString(intArr));
        System.out.println("Strings: " + Arrays.toString(strArr));
        System.out.println("Characters: " + Arrays.toString(charArr));
        System.out.println("Booleans: " + Arrays.toString(bool));

    }
}


/*****************Test Case****************
 * Numbers: [1, 21, 63, 4, 51]
 * Strings: [Sunday, Monday, Tuesday, Wednesday, Thursday, Fridat, Saturday]
 * Characters: [a, e, i, o, u]
 * Booleans: [true, false]
 *
 * **/
