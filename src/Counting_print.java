import java.util.Scanner;

public class Counting_print {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of 'n': ");
        int n = sc.nextInt();

        // Print counting from 1 to n
        for (int i = 1; i<=n; i++){
            System.out.println(i);
        }

        // Print counting from n to 1
        for(int j = n; j>=1; j--){
            System.out.println(j);
        }

        int k = 1; // Print counting from 1 to n by using while loop
        while(k<=n){
            System.out.println(k);
            k++;
        }
    }
}
