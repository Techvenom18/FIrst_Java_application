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
//        for (int i =1; i<=3; i++){ //row
//            for (int j= 1; j<=3; j++){ //column
//                System.out.print("*");
//            }
//            System.out.println();      // move to next line
//        }

//        for (int i = 1; i<=3; i++){
//            for (int j = 1; j<=3; j++){
//                System.out.println("i = " +i+ ", j = " +j);
//            }
//        }

       /* // Break and Continue Keywords USE
        for (int i = 0; i<=6; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i<=6; i++){
            if(i==4){
                continue;
            }
            System.out.println(i);
        } */

//        //while loop
//        int i = 100;  //initialization
//        while(i>=0){  // condition
//            System.out.println(i);
//            i--;      // update
//        }

        //NESTED While Loop
//        int i = 1;
//        while (i<=4){
//            int j = 1; // important: reset for each row
//
//            while (j<=4){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // do-While Loop
        int i =1;  // Initialization of variable
        do{
            System.out.println(i);
            i++;  // update
        } while (i<=10);   //condition





    }
}
