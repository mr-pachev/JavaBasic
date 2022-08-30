package MoreExercises_07;

import java.util.Scanner;

public class PasswordGenerator_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int firstDigit = 1; firstDigit <= n; firstDigit++) { //цикъл за първата цифра
            for (int secondDigit = 1; secondDigit <= n; secondDigit++) { //цикъл за втората цифра
                for (int thirdDigit = 97; thirdDigit < 97 + l; thirdDigit++) { //цикъл за третата цифра(първи символ)
                    for (int fourthDigit = 97; fourthDigit < 97 + l; fourthDigit++) { //цикъл за четвъртата цифра(втория символ)
                        for (int fifthDigit = 1; fifthDigit <= n; fifthDigit++) { //цикъл за петата цифра
                             char symbolOne = (char) thirdDigit; //превръщане от int в char
                             char symbolTwoo = (char) fourthDigit;

                             if(fifthDigit > firstDigit && fifthDigit > secondDigit){ //условие за петата цифра
                                 System.out.printf("%d%d%c%c%d ", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);
                             }

                        }
                    }
                }
            }
        }

    }
}
