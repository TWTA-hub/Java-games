import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100.
        int randomNumber = (int) (Math.random() * 100) + 1;

        // Ask the user to guess the number.
        System.out.println("Guess a number between 1 and 100: ");
        int guess = scanner.nextInt();

        // Loop until the user guesses the correct number.
        while (guess != randomNumber) {
            if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            // Ask the user to guess again.
            System.out.println("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
        }

        // If the user guesses the correct number, print a message congratulating them.
        System.out.println("Congratulations! You guessed the correct number!");
    }
}