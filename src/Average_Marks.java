import java.util.Scanner;

public class Average_Marks {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Average marks: ");
        int Avg_marks = sc.nextInt();

        if (Avg_marks >=90){
            System.out.println("Outstanding Performance");
        }
        else if (Avg_marks >=80) {
            System.out.println("Good Performance");
        }
        else if (Avg_marks >=70) {
            System.out.println("Average Performance");
        }
        else if (Avg_marks >=33) {
            System.out.println("Pass");
        }
        else {
            System.out.println("You are failed");
        }

    }
}
