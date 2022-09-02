package Exam_01;

import java.util.Scanner;

public class NameGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine(); //име на играча

        String currentName = "";
        String winnerName = "";
        int currentWin = 0;
        int bestWin = 0;

        while (!name.equals("Stop")) {
            currentName = name;
            currentWin = 0;

            for (int currentLetter = 0; currentLetter < name.length(); currentLetter++) {

                int possibleLetter = Integer.parseInt(scanner.nextLine()); //текущо въведено число за комкретния играч

                char currentSymbol = name.charAt(currentLetter); //текущата буква от името
                int digitCurrentLetter = (int) currentSymbol; //текущата буква, като символ

                if (digitCurrentLetter == possibleLetter) {
                    currentWin += 10;
                } else {
                    currentWin += 2;
                }
            }
            //определя името на победителя до момента и най-високият резултат, включително и при равенство
            if (bestWin < currentWin) {
                bestWin = currentWin;
                winnerName = name;
            } else if (bestWin == currentWin) {
                winnerName = currentName;
            }

            name = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!", winnerName, bestWin);
    }
}
