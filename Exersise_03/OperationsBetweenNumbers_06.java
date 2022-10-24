package Exersise_03;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double count = 0;
        String evenOrOdd = "";

        if (operator.equals("+")) {
            count = numOne + numTwo;
            if (count % 2 == 0) {
                evenOrOdd = "even";
            } else if (count % 2 != 0) {
                evenOrOdd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s",numOne, operator, numTwo,count, evenOrOdd);
        } else if (operator.equals("-")) {
            count = numOne - numTwo;
            if (count % 2 == 0) {
                evenOrOdd = "even";
            } else if (count % 2 != 0) {
                evenOrOdd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s",numOne, operator, numTwo,count, evenOrOdd);
        } else if (operator.equals("*")) {
            count = numOne * numTwo;
            if (count % 2 == 0) {
                evenOrOdd = "even";
            } else if (count % 2 != 0) {
                evenOrOdd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s",numOne, operator, numTwo,count, evenOrOdd);

        } else if (operator.equals("/")) {
            if (numTwo == 0){
                count = 0;
                System.out.printf("Cannot divide %d by zero", numOne);
            }else if (numTwo !=0){
                count = numOne * 1.0 /numTwo;
                System.out.printf("%d / %d = %.2f", numOne, numTwo, count);
            }

        } else if (operator.equals("%")) {
            if (numTwo == 0){
                count = 0;
                System.out.printf("Cannot divide %d by zero", numOne);
            }else if (numTwo !=0){
                count = numOne % numTwo;
                System.out.printf("%d %s %d = %.0f", numOne, operator, numTwo, count);
            }
        }

    }
}
