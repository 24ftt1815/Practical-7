import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int count = 0;

        System.out.println("Enter numbers, the input ends with 0 entered:");

        while (true) {
            int numb = input.nextInt();
            if (numb == 0) break;

            if (numb > largest) {
                largest = numb;
                count = 1;
            } else if (numb == largest) {
                count++;
            }
        }

        if (largest == Integer.MIN_VALUE) {
            System.out.println("No numbers entered.");
        } else {
            System.out.println("The largest number is " + largest);
            System.out.println("The occurrence count of the largest number is " + count);
        }
    }
}
