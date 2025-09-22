//Task 1
import java.util.Scanner;
public class FootballPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the players name?");
        String name = scanner.nextLine();
        System.out.println("What is the players age?");
        int age = scanner.nextInt();
        System.out.println("What is the players Height?");
        double height = scanner.nextDouble();
        System.out.println("What is the players Weight in pounds?");
        double weight = scanner.nextDouble();
        System.out.println("What is the players Jersey Number?");
        int jerseyNumber = scanner.nextInt();
        System.out.println("Player Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height - " + height + "m");
        System.out.println("Weight - " + weight + "lbs");
        System.out.println("Jersey Number - " + jerseyNumber);
//Task 2
        System.out.println("Task 2");
        final double pound = 0.45359237;
        final int meter = 100;
        double convertedWeight = weight * pound;
        double convertedHeight = height * meter;
        int roundedWeight = (int) convertedWeight;
        System.out.println("Player Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height in Centimetres - " + convertedHeight + "cm");
        System.out.println("Weight in Kilograms - " + roundedWeight + "kg");
        System.out.println("Jersey Number - " + jerseyNumber);

//Task 3
        System.out.println("Task 3");
        System.out.println("Players age now is:" + age);
        System.out.println("Players Jersey Number now is: " + jerseyNumber);
        int newAge = ++age;
        int penalty = --jerseyNumber;
        System.out.println("Players age after one season: " + newAge);
        System.out.println("Jersey Number after a penalty: " + penalty);


//Task 4
        System.out.println("Task 4");
        if ((age >= 18 && age <= 35) && (roundedWeight < 90)) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        if ((age < 18) || (roundedWeight >= 90)) {
            System.out.println("Player has a problem(either too young or too heavy)");
        }
        boolean eligible = (age >= 18 && age <= 35) && (roundedWeight < 90);
        if (!eligible) {
            System.out.println("Not Eligible");
        }



//Task 5
        System.out.println("Task 5");
        String category = "";
        if(age<20) {
            category = "Rising Star";
        }
        else if (age<=30) {
            category = "Prime Player";
        }
        else {
            category = "Veteran";
        }
        System.out.println("Category: "+ category);

//Task 6
        System.out.println("Task 6");
        switch(jerseyNumber) {
            case 1:
                System.out.println("Goalkeeper");
                break;
            case 2:
                System.out.println("Defender");
                break;
            case 5:
                System.out.println("Defender");
                break;
            case 6:
                System.out.println("Midfielder");
                break;
            case 8:
                System.out.println("Midfielder");
                break;
            case 7:
                System.out.println("Winger");
                break;
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
//Task 7 Part A
        System.out.println("Task 7, Part A");
        switch(jerseyNumber) {
            case 1:
                System.out.println("Goalkeeper");
                break;
            case 2:
                System.out.println("Defender");
            case 5:
                System.out.println("Defender");
                break;
            case 6:
                System.out.println("Midfielder");
            case 8:
                System.out.println("Midfielder");
                break;
            case 7:
                System.out.println("Winger");
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
//Task 7 PartB
        System.out.println("Task 7 Part B");
        switch (jerseyNumber){
            case 1:
                System.out.println("Goalkeeper");
                break;
            case 2:
            case 5:
                System.out.println("Defender");
                break;
            case 6:
            case 8:
                System.out.println("Midfielder");
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
//Task 8
        System.out.println("Task 8");
        if (category.equals("Prime Player")) {
            if (convertedWeight < 80) {
                System.out.println("Starting lineup");
            } else {
                System.out.println("Bench");
            }
        } else {
            System.out.println("Bench");
        }
//Task 9
        String finalDecision =eligible? "Play" : "Rest";
        System.out.println("Decision: "+finalDecision);

//Task 10
         System.out.println("Task 10");

















        }


    }

}}



