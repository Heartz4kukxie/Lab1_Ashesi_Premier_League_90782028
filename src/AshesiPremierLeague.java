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

        System.out.println("Enter the height of the player(in meters)");
        height = input.nextDouble();

        System.out.println("Enter the weight  of the player(in pounds)");
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
        final double POUND =0.45359237;
        final int METER = 100;

        // converting weight to kg and height to centimeters

         double convertingWeight = weight * POUND;
         double convertingHeight = height *  METER;

        // Round weight to an integer using casting
         int weightInKg = (int)convertingWeight;
         int heightInCentimeters  = (int)convertingHeight;

        //Code for output of  the details after conversion

        System.out.println("Player Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height in centimeters  -" + heightInCentimeters + "cm");
        System.out.println("Weight  in Kilogram-" + weightInKg + "kg");
        System.out.println("Jersey number -" + jersey_number);



        //Task 3 Increment and Decrement

        //Task 4
        //Checking eligibility of player

        if (age >= 18 &&  age <= 35 && weight <90){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

        //Task 5
        //Categorizing players by age
        if(age < 20){
            System.out.println("Rising Star");
        }else if(age >= 20 && age < 30){
            System.out.println("Prime Player");
        } else if (age >30){
            System.out.println("Veteran");
        }
        switch (jersey_number){
            case 1:
                System.out.println("Goalkeeper" );
                break;
            case 2:
            case 5:
                System.out.println("Defender");
                break;

            case 6:
            case 8:
                System.out.println("Midfielder,");
                break;
            case 7:
            case 11:

                System.out.println("Winger");
                break;

            case 9:
                System.out.println("Striker");
                break;

            case 10:
                System.out.println("Playmaker");
                break;
            default:
                System.out.println("Player position not known");



        }







    }
}
