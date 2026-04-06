import java.util.Scanner;

public class Average_of_top4 {
    static void main() {

        // Take input 5 subjects marks, drop the least one and calculate the overall percentage considering only the top 4 marks, print it!
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maths marks: ");
        int MM = sc.nextInt();

        System.out.print("Enter Science marks: ");
        int SM = sc.nextInt();

        System.out.print("Enter English marks: ");
        int EM = sc.nextInt();

        System.out.print("Enter Hindi marks: ");
        int HM = sc.nextInt();

        System.out.print("Enter Sst marks: ");
        int STM = sc.nextInt();

        if (MM<SM && MM<EM && MM<HM && MM<STM){
            float avg = (SM+EM+HM+STM)/4;
            System.out.println("Average of top 4 is: " + avg);
        }
        else if (SM<MM && SM<EM && SM<HM && SM<STM) {
            float avg = (MM+EM+HM+STM)/4;
            System.out.println("Average of top 4 is: " + avg);
        }
        else if (EM<MM && EM<SM && EM<HM && EM<STM) {
            float avg = (SM+MM+HM+STM)/4;
            System.out.println("Average of top 4 is: " + avg);
        }
        else if (HM<MM && HM<SM && HM<EM && HM<STM) {
            float avg = (SM+EM+MM+STM)/4;
            System.out.println("Average of top 4 is: " + avg);
        }
        else if (STM<MM && STM<SM && STM<EM && STM<HM) {
            float avg = (SM+EM+HM+MM)/4;
            System.out.println("Average of top 4 is: " + avg);
        }
    }
}
