package MoreExercises_07;

import java.util.Scanner;

public class SumOfTwoNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdMagicNum = Integer.parseInt(scanner.nextLine());
        int counterSum = 0;
        boolean isEmpty = true;

        for (int startNum = firstNum; startNum <= secondNum; startNum++) { //цикъл за първото число
            for (int endNum = firstNum; endNum <= secondNum; endNum++) { // икъл за второто число
                counterSum++;

                if (startNum + endNum == thirdMagicNum) { //условие за печат на подходящия сбор
                    System.out.printf("Combination N:%d (%d + %d = %d)", counterSum, startNum, endNum, thirdMagicNum);
                    isEmpty = false;
                    break;
                }

            }
            if(!isEmpty){
                break;
            }
        }
        if(isEmpty){
            System.out.printf("%d combinations - neither equals %d", counterSum, thirdMagicNum);
        }

    }
}
