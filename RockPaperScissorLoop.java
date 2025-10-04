import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Random random = new Random();
        int userScore = 0; 
        int compScore = 0;
        int rounds = 0;
        
        String again;

        do {
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            int userChoice = input.nextInt();
            int compChoice = random.nextInt(3);

            String[] names = {"rock", "paper", "scissor"};
            System.out.println("The computer is " + names[compChoice] + ". You are " + names[userChoice] + ".");

            if (userChoice == compChoice) {
                System.out.println("It is a draw.");
            } else if ((userChoice == 0 && compChoice == 2) 
                       || (userChoice == 1 && compChoice == 0) 
                       || (userChoice == 2 && compChoice == 1)) {
                System.out.println("You win.");
                userScore++;
            } else {
                System.out.println("You lose.");
                compScore++;
            }
            rounds++;

            System.out.print("\nEnter y to play again: ");
            again = input.next();

        } while (again.equalsIgnoreCase("y"));


        if (userScore > compScore) {
            System.out.println("You won the game.");
        } else if (userScore < compScore) {
            System.out.println("You lose the game.");
        } else {
            System.out.println("It is a draw game.");
        }

        System.out.println("\nIn the total of " + rounds + " round, You scored " + userScore + ", Computer scored " + compScore);






//         int randomGen = (int) (Math.random()*100);

//         int randomGenNum = randomGen % 3;

//         if (randomGenNum == 0 && choice == 0){
//             System.out.println("The computer is rock. You are rock. It is a draw.");
//         }
//         if (randomGenNum == 0 && choice == 1){
//             System.out.println("The computer is rock. You are paper. You Win.");
//         }
//         if (randomGenNum == 0 && choice == 2){
//             System.out.println("The computer is rock. You are scissor. You Lose.");
//         }
// // 
//         if (randomGenNum == 1 && choice == 0){
//             System.out.println("The computer is paper. You are rock. You Lose.");
//         }
//         if (randomGenNum == 1 && choice == 1){
//             System.out.println("The computer is paper. You are paper. It is a draw.");
//         }
//         if (randomGenNum == 1 && choice == 2){
//             System.out.println("The computer is paper. You are scissor. You Win.");
//         }
// // 
//         if (randomGenNum == 2 && choice == 0){
//             System.out.println("The computer is scissor. You are rock. You Win.");
//         }
//         if (randomGenNum == 2 && choice == 1){
//             System.out.println("The computer is scissor. You are paper. You Lose.");
//         }
//         if (randomGenNum == 2 && choice == 2){
//             System.out.println("The computer is scissor. You are scissor. It is a draw.");
//         }
    }
}
