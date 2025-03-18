import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private int randomNumber; 
    private int noOfGuesses; 
    
    public GuessTheNumberGame() {
        Random rand = new Random();
        this.randomNumber = rand.nextInt(100) + 1; 
        this.noOfGuesses = 0; 
    }

    public int takeUserInput() {
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter your guess (between 1 and 100): ");
        int userGuess = S1.nextInt();
        return userGuess;
    }

    public boolean isCorrectNumber(int userGuess) {
        noOfGuesses++; 
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

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            int userGuess = game.takeUserInput();
            hasGuessedCorrectly = game.isCorrectNumber(userGuess);
        }
    }
}
