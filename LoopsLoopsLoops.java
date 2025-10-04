import java.util.Scanner;

public class LoopsLoopsLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Below is generated using while loop:");
        int j = 0;
        while (j<20) {
            j++;        //if j nya sni, then ia 1-5
            System.out.print(j+" ");
            // j++;        //if j nya sni, then ia 0-4
        }


        System.out.println("\n\nBelow is generated using dowhile loop:");
        int num = 50; 
        do {
            System.out.print(num + " "); 
            num--; 
        } while (num >= 35);

        System.out.println("\n\nBelow is generated using for loop:");
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }

    }
}
