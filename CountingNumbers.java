import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer, the input ends if it is 0: ");
 
        int totalNum = 0; 
        int posNum = 0; 
        int negNum = 0; 
        int numCount = 0;
        double avg;

        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            if (num > 0) posNum++;
            else negNum++;

            totalNum += num;
            numCount++;
        }

        if (numCount == 0) {
            System.out.println("No numbers are entered except for 0 to end the program.");
        } else {
            avg = (double) totalNum / numCount;
            System.out.println("The number of positives is " + posNum);
            System.out.println("The number of negatives is " + negNum);
            System.out.println("The total is " + totalNum);
            System.out.printf("The average is %.2f\n", + avg);
            
        }

        
    }
}