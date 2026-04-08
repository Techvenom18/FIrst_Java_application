import java.util.Scanner;

public class YourNamePrting {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); //Take string as input in java
        int i = 1;
        while (i<=100){
            System.out.println("My name is: " + name);
            i++;
        }


    }
}
