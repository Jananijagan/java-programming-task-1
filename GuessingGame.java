import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAttempts = 5;
        int rounds = 3;
        int score = 0;

        for (int round = 1; round <= rounds; round++) {
            System.out.println("Round " + round);
            int randomNumber = (int) (Math.random() * 100) + 1;
            int attempts = 0;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (1-100): ");
                int guess = scanner.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number in " + (attempts + 1) + " attempts.");
                    score++;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                attempts++;
            }

            if (attempts == maxAttempts) 
 {
                System.out.println("Sorry, you ran out of attempts. The number was " + randomNumber);
            }
        }

        System.out.println("Your final score is " + score + " out of " + rounds);
        scanner.close();
    }
    
}