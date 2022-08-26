package MoreExercises_07;

import java.util.Scanner;

public class SafePasswordsGenerator_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPassCombinations = Integer.parseInt(scanner.nextLine()); //брой допустими комбинаций

        int counterCombination = 0;
        int firstDigit = 35;
        int secondDigit = 64;
        boolean isEnough = false;

        for (int thirdDigit = 1; thirdDigit <= a; thirdDigit++) {
            for (int forthDigit = 1; forthDigit <= b; forthDigit++) {
                counterCombination++;

                if (firstDigit > 55){
                    firstDigit = 35;
                }
                if (secondDigit > 96){
                    secondDigit = 64;
                }

                if(counterCombination > maxPassCombinations){
                    isEnough = true;
                    break;
                }

                System.out.printf("%c%c%d%d%c%c|", firstDigit, secondDigit, thirdDigit, forthDigit,secondDigit, firstDigit);
                firstDigit++;
                secondDigit++;

            }

            if(isEnough){
                break;
            }
        }



    }
}
