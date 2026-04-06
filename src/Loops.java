public class Loops {
    static void main() {

        // For Loop
        for(int i=1; i<=10; i += 2){
            System.out.println(i);
        }

//        for (int i = 1; i<=100; i++){
//            System.out.println(i);
//        }

        // Nested loop
        for (int i =1; i<=3; i++){
            for (int j= 1; j<=3; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
