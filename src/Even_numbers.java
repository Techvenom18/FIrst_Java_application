import java.util.Scanner;

public class Even_numbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n, n must be even for taking all even number from 1 to 100: ");
        int n = sc.nextInt();

        if (n%2==0) {
            int i = 2;
            while (i <= 100) {
                System.out.println(i);
                i = i + 2;
            }
        }
        else{
            System.out.println("Oops Invalid input, Pls give even numbers only to get all even numbers from 1 to 100");
        }
    }
}
