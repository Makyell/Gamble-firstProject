import java.util.Scanner;

public class Main {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int cash = 10;

        while (cash > 0 && cash <= 10) {

            int secretNumber = (int) (Math.random() * 10) + 1;

            System.out.println("You Have " + cash + "$");

            for (int i = 0; 3 > i; i++) {
                System.out.print("Guess the random number from 1 to 10: ");
                int userNumber = scanner.nextInt();

                if (userNumber == secretNumber) {
                    System.out.println(GREEN + "You win!" + RESET);
                    cash += 5;
                    String win;
                    if (cash == 15) {
                        win = ", so you've won the game";
                    } else {
                        win = "";
                    }
                    System.out.println("Now you have " + cash + "$ left" + win);
                    break;
                } else if (0 == i) {
                    System.out.println("You guessed wrong, you have " + 2 + " more attempts");
                } else if (1 == i) {
                    System.out.println("You guessed wrong, you have " + 1 + " more attempt");
                } else {
                    cash -= 5;
                    String lose;
                    if (cash == 0) {
                        lose = "You're too poor to play the game again (0$)";
                    } else {
                        lose = "";
                    }
                    System.out.println(RED + "You lose! The number was " + secretNumber + RESET);
                    System.out.println(lose);
                    break;
                }
            }
        }
    } test
}
