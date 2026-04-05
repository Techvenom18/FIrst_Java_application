public class Variable {
    static void main() {
//        int age;
//        System.out.println(age);

        // variable intiallization or upgradation
        int age = 10;
            age = 11;
        System.out.println(age);

        // Case sensitive
        int weight = 80;
        int WEIGHT = 90;
        System.out.println(weight);
        System.out.println(WEIGHT);

        // Starting Letter
        int marks = 100;
        int Marks = 101;
        int _marks = 102;
        int $marks = 103;
        System.out.println(marks);
        System.out.println(Marks);
        System.out.println(_marks);
        System.out.println($marks);

        // Conventions variable name
        int DAYS_IN_YEAR = 365; // when we know variable value is constant so we must initialize variable name in UPPERCASE
        System.out.println(DAYS_IN_YEAR);
        int daysInYear = 365; // CamelCase naming ( 1st word = lower-cse & 2nd word = Starting letter Caps m )
        System.out.println(daysInYear);
    }

}
