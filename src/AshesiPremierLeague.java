import java.util.Scanner;

public class AshesiPremierLeague {
    public static void main(String[] args) {

        // declaring variables
        String name;
        int age;
        int jersey_number;
        double weight;
        double height;


        //Accepting input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the player");
        name = input.nextLine();

        System.out.println("Enter the age of the player");
        age = input.nextInt();

        System.out.println("Enter the height of the player");
        height = input.nextDouble();

        System.out.println("Enter the weight  of the player");
        weight = input.nextDouble();

        System.out.println("Enter the jersey number of the player");
         jersey_number = input.nextInt();

         //Code for output of  the details

        System.out.println("Player Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height -" + height);
        System.out.println("Weight -" + weight);
        System.out.println("Jersey number -" + jersey_number);



        //TASK 2
        // Declaring constat variables to convert weight to kilograms and the height to centimeters
        final double pound =0.45359237;



    }
}
