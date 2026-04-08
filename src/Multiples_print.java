import java.util.Scanner;

public class Multiples_print {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (n%2==0){
            int i = 1;
            while (i<=10){
                System.out.println(i*n);
                i++;
            }
        }
        else if (n%2!=0) {
            int i = 1;
            while (i<=10){
                System.out.println(i*n);
                i++;
            }

        }
    }
}
