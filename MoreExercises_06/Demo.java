package MoreExercises_06;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= (n + 1) / 2; i++) { //цикъл за принтиране на горните редове до основата на къщичката

            for (int j = i; j <= n; j++) { //цикъл за отпечатване на всички символи на текущия ред

                if (n % 2 != 0) { //проверка дали въведеното число n e нечетно

                    if (j <= n / 2 || j > (n / 2) + 1) { //проверка дали текущия индекс е по-малък от средата или по-голям
                        System.out.print("-");
                    } else {
                        System.out.print("*");
                        if (i > 1) { //проверка за принтиране на допълнителните ** на всеки следващ ред
                            for (int k = 1; k < i; k++) { //взависимост от текущия ред се принтират и допълнителните **
                                System.out.print("**");
                                j++; //при всяко принтиране на допълнителните ** увеличаваме брояча на цикъла
                            }
                        }
                    }

                } else {
                    if (j < n / 2 || j > (n / 2)) { //проверка дали текущия индекс е по-малък от средата или по-голям
                        System.out.print("-");
                    } else {
                        System.out.print("**");
                        j++; //при всяко принтиране на допълнителните ** увеличаваме брояча на цикъла
                        if (i > 1) { //проверка за принтиране на допълнителните ** на всеки следващ ред
                            for (int k = 1; k < i; k++) { //взависимост от текущия ред се принтират и допълнителните **
                                System.out.print("**");
                                j++; //при всяко принтиране на допълнителните ** увеличаваме брояча на цикъла
                            }
                        }
                    }
                }
            }
            System.out.println();
        }

        // принтиране основите на къщичката
        for (int i = 1; i <= n / 2; i++) { //определя спрямо n колко реда ще има основата на къщичката
            System.out.print("|");
            for (int j = 1; j <= n - 2; j++) { //определя броя на звездичките между | на реда
                System.out.print("*");
            }
            System.out.print("|");
            System.out.println();
        }

    }
}
