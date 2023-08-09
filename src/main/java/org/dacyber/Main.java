package org.dacyber;

import java.util.Scanner;




// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        System.out.println (" CHECK YOUR BMI");

        System.out.println (" ENTER THE NUMERIC VALUE OF YOUR WEIGHT IN KILOGRAM");
        Scanner input = new Scanner(System.in) ;
        double weight = input.nextDouble() ;


        System.out.println (" ENTER THE NUMERIC VALUE OF YOUR HEIGHT IN METERS");
        Scanner input2 = new Scanner(System.in) ;
         double height = input2.nextDouble() ;



        double bmi = (weight / (height * height));


            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.printf("%.1f",bmi);
        }
    }
