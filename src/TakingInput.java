import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main() {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for firstNum: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value of secondNum: ");
        int secondNum = sc.nextInt();

        int ans = firstNum + secondNum;
        System.out.println("Answer is: " + ans);

        BigInteger bg = sc.nextBigInteger();
        System.out.println(bg);

        boolean bool = sc.hasNextBoolean();
        System.out.println(bool);

        sc.close();

    }
}
