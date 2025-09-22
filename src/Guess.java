import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        final int GUESS = 14;
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Guess the number: ");
        number = input.nextInt();

        while (number!=GUESS){
            if (GUESS < number) {
                System.out.println("Number too high");

           } else if (GUESS > number) {
                System.out.println("Number too small");
            }
                System.out.println("Wrong number");
                number = input.nextInt();


        }
        System.out.println("Congratulations! You guessed the number.");
        input.close();
        }
    }

