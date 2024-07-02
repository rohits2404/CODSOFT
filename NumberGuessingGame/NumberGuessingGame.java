import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{

    public static void multipleRound(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Do You Want to Play Again (Press Y for Yes and N for No): ");
        String nextRound = sc.nextLine();

        if(nextRound.equals("Y")){
            Game();
        }
        else{
            sc.close();
            return;
        }
        sc.close();
    }

    public static void Game()
    {
        Random rand = new Random();

        int randomNumber = rand.nextInt(100)+1;
        System.out.println("Random Number is : "+randomNumber);

        Scanner sc = new Scanner(System.in);

        int numberOfAttempts = 4;

        int numberOfTry = 0;

        while(numberOfAttempts!=0){

            System.out.println("Enter Your Guess (1-100) : ");

            int playerGuess = sc.nextInt();
            numberOfTry++;

            if(randomNumber==playerGuess){
                System.out.println("Correct Guess ! You Won the Game");
                System.out.println("User Score : "+numberOfTry);
                multipleRound();
                sc.close();
                return;
            }

            else if(randomNumber>playerGuess){
                System.out.println("Guess is Too Low! Guess Again");
            }

            else{
                System.out.println("Guess is Too High! Guess Again");
            }
            numberOfAttempts--;
        }
        System.out.println("Out of attempts. The correct number was: " + randomNumber);
        sc.close();
    }
    public static void main(String[] args) {
        Game();
    }
}