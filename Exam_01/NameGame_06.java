package Exam_01;

import java.util.Scanner;

public class NameGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int counterPointsFirstPlayer = 0;
        int counterPointsSecondPlayer = 0;
        int  playersCounter = 0;
        String firstPlayerName = "";
        String secondPlayerName = "";

        while (!name.equals("Stop")){
            playersCounter++;

            if(playersCounter == 1){
            for (int currentLetter = 0; currentLetter < name.length(); currentLetter++) {
                firstPlayerName = name;
                int possibleLetter = Integer.parseInt(scanner.nextLine());
                char possibleSymbol = (char) possibleLetter;

                char currentSymbol = name.charAt(currentLetter);

                if (currentSymbol == possibleSymbol) {
                    counterPointsFirstPlayer += 10;
                } else {
                    counterPointsFirstPlayer += 2;
                }
            }
            }else {
                for (int currentLetter = 0; currentLetter < name.length(); currentLetter++) {
                    secondPlayerName = name;
                    int possibleLetter = Integer.parseInt(scanner.nextLine());
                    char possibleSymbol = (char) possibleLetter;

                    char currentSymbol = name.charAt(currentLetter);

                    if (currentSymbol == possibleSymbol) {
                        counterPointsSecondPlayer += 10;
                    } else {
                        counterPointsSecondPlayer += 2;
                    }

                }

            }

            name = scanner.nextLine();
        }

        if (counterPointsFirstPlayer > counterPointsSecondPlayer){
            System.out.printf("The winner is %s with %d points!", firstPlayerName, counterPointsFirstPlayer);
        }else if (counterPointsFirstPlayer < counterPointsSecondPlayer){
            System.out.printf("The winner is %s with %d points!", secondPlayerName, counterPointsSecondPlayer);
        }else {
            System.out.printf("The winner is %s with %d points!", secondPlayerName, counterPointsSecondPlayer);
        }



    }
}
