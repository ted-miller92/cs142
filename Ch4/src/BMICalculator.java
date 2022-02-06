// BMICalculator.java
// This program prompts the user for input for the height/weight of 2 different people
// Calculates the BMI of each person and which category they fall into
import java.util.*;

public class BMICalculator {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        double bmi1 = getBMI(console);
        double bmi2 = getBMI(console);

        System.out.println();

        String category1 = getCategory(bmi1);
        String category2 = getCategory(bmi2);

//        System.out.println("Person 1: " + bmi1 + "(" + category1 + ")" );
//        System.out.println("Person 2: " + bmi2 + "(" + category2 + ")" );

        System.out.printf("Person 1 BMI: %5.2f (" + category1 + ")\n", bmi1);


    }

    public static double getBMI(Scanner console){
        System.out.println("Next person\'s information");
        System.out.print("Height: ");
        double height = console.nextDouble();
        System.out.print("Weight: ");
        double weight = console.nextDouble();

        double bmi = (weight / (height * height)) * 703;
        return bmi;
    }
    public static String getCategory(double bmi){
        String bmiCategory = "";
        if (bmi < 18.5){
            bmiCategory = "Underweight";
        } else if (bmi < 25){
            bmiCategory = "Normal";
        } else if (bmi < 30){
            bmiCategory = "Overweight";
        } else { // bmi1 >= 30
            bmiCategory = "Obese";
        }
        return bmiCategory;
    }
}
