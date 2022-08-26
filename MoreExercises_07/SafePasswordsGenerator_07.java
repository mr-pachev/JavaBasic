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

        for (int thirdDigit = 1; thirdDigit <= a; thirdDigit++) { //цикъл за третата цифра
            for (int forthDigit = 1; forthDigit <= b; forthDigit++) { //цикъл за четвъртата цифра
                counterCombination++; //ъпдейт на брояча преди проверката

                if (firstDigit > 55){ //проверка условие за първата цифра
                    firstDigit = 35;
                }
                if (secondDigit > 96){ //проверка условие за втората цифра
                    secondDigit = 64;
                }

                if(counterCombination > maxPassCombinations){ //проверка за броя направени комбинаций
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
