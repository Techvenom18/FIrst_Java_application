public class Operators {
    static void main() {
        //Arithmetic operators
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedLastWeek+solvedThisWeek;
        int difference = solvedLastWeek - solvedThisWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek/7;
        int remainder = solvedThisWeek % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

        //Relational operators
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);

        // Logical operators
        boolean indian = true;
        boolean notIndian = false;

        System.out.println(indian && notIndian);
        System.out.println( indian || notIndian);
        System.out.println(! notIndian);

        //InstanceOf Operator
        String str = "Hello";
        if (str instanceof String) {
            System.out.println("It's a String!"); // Output: true
        }

        // Ternary Operator
        int age = 19;

        System.out.println((age >= 18) ? "Eligible for voting" : "Not eligible for voting");



    }
}
