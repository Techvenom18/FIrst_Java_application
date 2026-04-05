import java.util.Scanner;


public class Conditionals {
    static void main() {

        Scanner sc = new Scanner(System.in);

        // IF-ELSE Statement:
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//
//        if (age>=18) {
//            System.out.println("You are eligible to vote");
//        }
//        else {
//            System.out.println("You are not eligible to vote");
//        }

        // IF-ELSE-IF Statement
//        System.out.println("Enter your class 10th marks in percentage: ");
//        int marks = sc.nextInt();
//
//        if (marks >= 90){
//            System.out.println("Excellent performance");
//        }
//        else if (marks >= 75) {
//            System.out.println("Good performance");
//
//        } else if (marks <= 60) {
//            System.out.println("Average performance");
//
//        }
//        else{
//            System.out.println("pass");
//        }
//

        // Nested IF-Else Statement:

//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//        System.out.println("Enter you Gender first letter in capital:");
//        char gender = sc.next().charAt(0);
//
//        if (gender=='M'){
//            if (age>=18){
//                System.out.println("You are male and your age >= 18");
//            }
//            else{
//                System.out.println("you are male and your age is < 18");
//            }
//        }
//        else if(gender=='F'){
//            if (age>=18){
//                System.out.println("You are female and your age >= 18");
//            }
//            else{
//                System.out.println("you are female and your age is < 18");
//            }
//        }
//        else {
//            System.out.println("Damn");
//        }


        // Ternary Operator:
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//
//        string voting = (age>=18) ? "Eligible to vote" : "Not eligible to vote";
//
//        System.out.println(voting);

        // Switch Case statement:
        System.out.println("Enter the value for day: ");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Sunday");

        }

    }
}
