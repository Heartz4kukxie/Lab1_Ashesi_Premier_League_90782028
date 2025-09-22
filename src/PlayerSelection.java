
import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {

        // declaring variables
        String name;
        String lineUpDecision;
        String eligibility;
        String finalDecision;
        String position;
        String attackerJersey;
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

        System.out.println("Enter the height of the player(in meters)");
        height = input.nextDouble();

        System.out.println("Enter the weight  of the player(in pounds)");
        weight = input.nextDouble();

        System.out.println("Enter the jersey number of the player");
        jersey_number = input.nextInt();


        //TASK 2
        // Declaring constat variables to convert weight to kilograms and the height to centimeters
        final double POUND = 0.45359237;
        final int METER = 100;

        // converting weight to kg and height to centimeters

        double convertingWeight = weight * POUND;
        double convertingHeight = height * METER;

        // Round weight to an integer using casting
        int weightInKg = (int) convertingWeight;
        int heightInCentimeters = (int) convertingHeight;


        //Task 3 Increment and Decrement

        //Task 4
        //Checking eligibility of player



        if (age >= 18 && age <= 35 && weight < 90) {
            eligibility = "Eligible";
            System.out.println("Eligible");
        } else {
            eligibility = "Not Eligible";
            System.out.println("Not Eligible");
        }

        //Task 5
        //Categorizing players by age
        if (age < 20) {
            System.out.println("Rising Star");
        } else if (age >= 20 && age < 30) {
            System.out.println("Prime Player");
        } else if (age > 30) {
            System.out.println("Veteran");
        }

        //Task 5
        //Using Switch Cases to assign position based on jersey number
        switch (jersey_number) {
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
            case 5:
                position = "Defender";
                break;

            case 6:
            case 8:
                position = "Midfielder";
                break;
            case 7:
            case 11:
                position = "Winger";
                break;

            case 9:
                position = "Striker";
                break;

            case 10:
                position = "Playmaker";
                break;
            default:
                position = "Player position not known";

        }
        // Code for checking if player has an attacker jersey
        if (jersey_number == 7 || jersey_number == 9 || jersey_number == 10 || jersey_number == 11) {
            attackerJersey = "Yes";
        } else {
            attackerJersey = "No";
        }



        if (age >= 20 && age < 30) {
            if (weightInKg < 80) {
                lineUpDecision = "Line Up";
            } else {
                lineUpDecision = "Bench";
            }
        } else {
            lineUpDecision = "Bench";
        }



        finalDecision = (eligibility.equals("Eligible")) ? "Play" : "Rest";
             //Task 10
            System.out.println("Player Report");
            System.out.println("Player: [" + name + "]");
            System.out.println(("Age: [" + age + "]"));
            System.out.println("Height: [" + heightInCentimeters + "cm]");
            System.out.println("Weight: [" + weightInKg + "kg]");
            System.out.println("Jersey:[" + jersey_number + "]");
            System.out.println("Position: [" + position + "]");
            System.out.println("Attacker jersey: [" + attackerJersey + "]");
            System.out.println("Eligibility: [" + eligibility + "]");
            System.out.println("Lineup Decision: [" + lineUpDecision + "]");
            System.out.println("Final Decision: [" + finalDecision + "]");


        }

    }





