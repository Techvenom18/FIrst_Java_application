import java.util.Scanner;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class Lower_Upper_Case {
    static void main() {

        //Take input a Lowercase or Uppercase and print its Uppercase or Lowercase version value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character value: ");
        char input = sc.next().charAt(0);

        if (input>='A' && input <= 'Z'){
            System.out.println("This is Lower case Character version value!");
            System.out.println(toLowerCase(input));
        }
        else if (input >= 'a' && input <= 'z') {
            System.out.println("This is Uppercase Character version value!");
            System.out.println(toUpperCase(input));
        }
        else{
            System.out.println("Oops Invalid input value, Please enter valid input value!!");
        }
    }
}
