package org.dacyber;

import java.util.Scanner;




// ADULT BMI CALCULATION IN KILOGRAM AND METERS
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(" CHECK YOUR BMI, FOR ADULTS ONLY");
// TAKE FLOAT INPUT FROM USER FOR WEIGHT

        System.out.println(" ENTER THE NUMERIC VALUE OF YOUR WEIGHT IN KILOGRAM");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();

// VALIDATING INPUTS
// TAKE FLOAT INPUT FROM USER FOR HEIGHT

        System.out.println(" ENTER THE NUMERIC VALUE OF YOUR HEIGHT IN METERS");
        input = new Scanner(System.in);
        double height = input.nextDouble();

// VALIDATING INPUTS
// CALCULATE BMI FORMULA
        double bmi = (weight / (height * height));

        if (bmi >= 40) {
            System.out.println("THE RESULT SHOWS THAT YOU ARE OBESE" + "  "+bmi);
        } else if (bmi >= 20.5) {
                System.out.println("THE RESULT SHOWS THAT YOU ARE OVERWEIGHT" + "  "+bmi);
            } else if (bmi >= 18.5) {
                System.out.println("THE RESULT SHOWS THAT YOU ARE NORMAL" + "  "+bmi );
            } else {
                System.out.println("THE RESULT SHOWS THAT YOU ARE UNDERWEIGHT" + "  "+bmi);
            }
    }

    }
