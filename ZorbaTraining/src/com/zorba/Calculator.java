package com.zorba;
import java.util.Scanner;

public class Calculator {
    // global variable declaration
    static double num1;
    static double num2;

    public static void main(String[] args) {
        // Manual Input of numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number :");
        num1 = sc.nextDouble();
        System.out.println("Enter your Second Number :");
        num2 = sc.nextDouble();
        int[] selection = {1, 2, 3, 4, 5};
        String operator[] = {"Addition", "Substraction", "Multiplication", "Division", "Exit"};
        peroformNextOperation(selection, operator, sc);
    }

    public static void peroformNextOperation(int[] selection, String[] operator, Scanner sc) {
        int operation;
        while(true) {
            for (int i = 0; i < selection.length; i++) {
                System.out.println(selection[i] + " > " + operator[i]);
            }
            System.out.println("Please provide your valid  selection");
            operation = sc.nextInt();
            if (operation <5 && operation>=1) {
                operation(num1, num2, operation);
            } else if(operation ==5){
                System.out.println("Thank you for using this App");
                System.exit(0);

            } else {
                System.out.println("Invalid number provided");
            }
        }
    }

    private static double operation(double num1, double num2, double operation ) {
        // System.out.println("Please Provide your selection ");
        double result = 0;

        if (operation == 1) {
            result = num1 + num2;
        } else if (operation == 2) {
            result = num1 - num2;
        } else if (operation == 3) {
            result = num1 * num2;
        } else if (operation == 4) {
            result = num1 / num2;
        } else {
            System.out.println("Thank you for using App");
        }
        System.out.println("The result is "+result);
        return result;
    }
}
