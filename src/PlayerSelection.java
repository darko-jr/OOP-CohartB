import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the player's name?");
        String name = scanner.nextLine();

        System.out.println("What is the player's age?");
        int age = scanner.nextInt();

        System.out.println("What is the player's height (meters)?");
        double height = scanner.nextDouble();

        System.out.println("What is the player's weight (pounds)?");
        double weight = scanner.nextDouble();

        System.out.println("What is the player's jersey number?");
        int jerseyNumber = scanner.nextInt();

        final double pound = 0.45359237;
        final int meter = 100;

        double convertedWeight = weight * pound;
        int roundedWeight = (int) convertedWeight;
        int heightCm = (int) (height * meter);

        String category = "";
        if (age < 20) {
            category = "Rising Star";
        } else if (age <= 30) {
            category = "Prime Player";
        } else {
            category = "Veteran";
        }

        String position = "";
        switch (jerseyNumber) {
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

        String attackingStatus = "";
        switch (jerseyNumber) {
            case 7:
            case 9:
            case 10:
            case 11:
                attackingStatus = "Yes";
                break;
            default:
                attackingStatus = "No";
        }

        boolean eligible = (age >= 18 && age <= 35) && (roundedWeight < 90);
        String eligibility = eligible ? "Eligible" : "Not Eligible";

        String lineUpDecision = "";
        if (category.equals("Prime Player")) {
            if (roundedWeight < 80) {
                lineUpDecision = "Starting lineup";
            } else {
                lineUpDecision = "Bench";
            }
        } else {
            lineUpDecision = "Bench";
        }
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + heightCm + " cm");
        System.out.println("Weight: " + roundedWeight + " kg");
        System.out.println("Jersey Number: " + jerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + attackingStatus);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Lineup Decision: " + lineUpDecision);

        String finalDecision = eligible ? "Play" : "Rest";
        System.out.println("Final Decision: " + finalDecision);

        scanner.close();
    }
}

