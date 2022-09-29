package exercises;

import java.util.Scanner;

public class MPGCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        double miles = input.nextDouble();
        System.out.println("Enter number of gallons of gas used: ");
        double gallonsOfGas = input.nextDouble();

        double mpg = miles / gallonsOfGas;

        System.out.printf("Your MPG is %.2f", mpg);
    }
}
