import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class day7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter your choice(rock, paper, scissors): ");

        String userChoice = sc.nextLine().toLowerCase();

        int randomChoice = random.nextInt(3);

        String computerChoice;

        if (randomChoice == 0){
            computerChoice = "rock";
        }else if (randomChoice == 1){
            computerChoice = "paper";
        }else {
            computerChoice = "scissors";
        }

        System.out.println("computer chose: " + computerChoice);

        if (userChoice.equals(computerChoice)){
            System.out.println("It's Draw!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("paper")) || (userChoice.equals("scissors") && computerChoice.equals("paper"))||(userChoice.equals("scissors") && computerChoice.equals("rock"))) {
            System.out.println("You win");
        }else if (userChoice.equals("rock") || userChoice.equals("paper")) {

            System.out.println(" Computer Wins!");
        }else{
            System.out.println("Invalid choice! Please enter rock, paper, or scissors.");
        }



    }
}