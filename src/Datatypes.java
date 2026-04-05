public class Datatypes {
    static void main() {
        //System.out.println("Hello jii");

        //Numeric DT - byte, short, int, long
        byte num1 = 127;
        System.out.println(num1);

        // Implicit typecasting
        long newnum1 = num1;
        System.out.println("This is conversion of small DT into large DT: " + newnum1);

        short num2 = 3207;
        System.out.println(num2);

        int num3 = 1980;
        System.out.println(num3);

        long num4 = 569875230;
        System.out.println(num4);

        // Floating DTs
        float num5= 5.5656255f;
        System.out.println(num5);

        double num6 = 526.0565;
        System.out.println(num6);

        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        // Explicit typecasting
        char firstCharacter = 'a';
        System.out.println("My name first character is: " + (char)(firstCharacter+2));





    }
}
