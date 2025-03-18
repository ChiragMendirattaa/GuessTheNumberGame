import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private int randomNumber; // The random number to be guessed
    private int noOfGuesses; // Number of guesses taken by the user

    // Constructor to generate a random number
    public GuessTheNumberGame() {
        Random rand = new Random();
        this.randomNumber = rand.nextInt(100) + 1; // Random number between 1 and 100
        this.noOfGuesses = 0; // Initialize the number of guesses to 0
    }

    // Method to take user input
    public int takeUserInput() {
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter your guess (between 1 and 100): ");
        int userGuess = S1.nextInt();
        return userGuess;
    }

    // Method to check if the guessed number is correct
    public boolean isCorrectNumber(int userGuess) {
        noOfGuesses++; // Increment the number of guesses
        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed the correct number in " + noOfGuesses + " guesses.");
            return true;
        } else if (userGuess < randomNumber) {
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Too high! Try again.");
        }
        return false;
    }

    // Getter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for noOfGuesses (optional, not required for this game)
//    public void setNoOfGuesses(int noOfGuesses) {
//        this.noOfGuesses = noOfGuesses;
//    }

    // Main method to play the game
    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            int userGuess = game.takeUserInput();
            hasGuessedCorrectly = game.isCorrectNumber(userGuess);
        }
    }
}