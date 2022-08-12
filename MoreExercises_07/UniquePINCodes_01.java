package MoreExercises_07;

import java.util.Scanner;

public class UniquePINCodes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        for (int firstDigit = 1; firstDigit <= firstNum; firstDigit++) { //принтиране на първата цифра
            if (firstDigit % 2 == 0 && firstDigit >= 1 && firstDigit <= 9) {

                for (int secondDigit = 1; secondDigit <= secondNum; secondDigit++) { //принтиране на втората цифра
                    // метод за проверка дали число secongDigit е  просто, връща false или true
                    int divider = 2;
                    int maxDivider = (int) Math.sqrt(secondDigit);
                    boolean prime = true;
                    while (prime && (divider <= maxDivider)) {
                        if (secondDigit % divider == 0) {
                            prime = false;
                        }
                        divider++;
                    }
                    if (secondDigit >= 2 && secondDigit <= 7 && prime) { // проверка дали втората цифра отговаря на зададените условия

                        for (int thirdDigit = 1; thirdDigit <= thirdNum; thirdDigit++) { //принтиране на третата цифра
                            if (thirdDigit % 2 == 0 && thirdDigit >= 1 && thirdDigit <= 9) {
                                System.out.print(firstDigit + " ");
                                System.out.print(secondDigit + " ");
                                System.out.println(thirdDigit);
                            }
                        }
                    }
                }
            }
        }
    }
}
