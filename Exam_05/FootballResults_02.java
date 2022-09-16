package Exam_05;

import java.util.Scanner;

public class FootballResults_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstFootballGame = scanner.nextLine();; //резултат
        String secondFootballGame = scanner.nextLine();; //резултат
        String thirdFootballGame = scanner.nextLine();; //резултат

        int resultHostsOne = 0; //резултат домакини
        int resultGuestsOne = 0; //резултат гости
        int resultHostsTwo = 0; //резултат домакини
        int resultGuestsTwo = 0; //резултат гости
        int resultHostsTree = 0; //резултат домакини
        int resultGuestsTree = 0; //резултат гости
        int countWin = 0;
        int countLoss = 0;
        int countEquality = 0;

            resultHostsOne = Integer.parseInt(firstFootballGame.split("")[0]);
            resultGuestsOne = Integer.parseInt(firstFootballGame.split("")[2]);

            if (resultHostsOne > resultGuestsOne){
                countWin++;
            }else if (resultHostsOne < resultGuestsOne){
                countLoss++;
            }else {
                countEquality++;
            }

        resultHostsTwo = Integer.parseInt(secondFootballGame.split("")[0]);
        resultGuestsTwo = Integer.parseInt(secondFootballGame.split("")[2]);

        if (resultHostsTwo > resultGuestsTwo){
            countWin++;
        }else if (resultHostsTwo < resultGuestsTwo){
            countLoss++;
        }else {
            countEquality++;
        }

        resultHostsTree = Integer.parseInt(thirdFootballGame.split("")[0]);
        resultGuestsTree = Integer.parseInt(thirdFootballGame.split("")[2]);

        if (resultHostsTree > resultGuestsTree){
            countWin++;
        }else if (resultHostsTree < resultGuestsTree){
            countLoss++;
        }else {
            countEquality++;
        }

        System.out.printf("Team won %d games.%n", countWin);
        System.out.printf("Team lost %d games.%n", countLoss);
        System.out.printf("Drawn games: %d", countEquality);
    }
}
