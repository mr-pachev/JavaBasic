package Exam_07;

import java.util.Scanner;

public class BarcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine()); //начало на интервала
        int endNum = Integer.parseInt(scanner.nextLine()); //край на интервала


            int fourthDigit =  startNum % 10;
            startNum = startNum / 10;
            int thirdDigit = startNum % 10;
            startNum = startNum / 10;
            int secondDigit = startNum % 10;
            startNum = startNum / 10;
            int firstDigit = startNum;

        int fourthDigitTwo =  endNum % 10;
        endNum = endNum / 10;
        int thirdDigitTwo =  endNum % 10;
        endNum = endNum / 10;
        int secondDigitTwo =  endNum % 10;
        endNum = endNum / 10;
        int firstDigitTwo = endNum;

            for (int i = firstDigit; i <= firstDigitTwo; i++) {

                if (i % 2 != 0) {
                    for (int j = secondDigit; j <= secondDigitTwo; j++) {

                        if (j % 2 != 0) {
                            for (int k = thirdDigit; k <= thirdDigitTwo; k++) {

                                if (k % 2 != 0) {
                                    for (int l = fourthDigit; l <= fourthDigitTwo; l++) {

                                        if (l % 2 != 0) {
                                            System.out.printf("%d%d%d%d ", i, j, k, l);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

    }
}
