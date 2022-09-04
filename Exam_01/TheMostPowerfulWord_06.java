package Exam_01;

import java.util.Scanner;

public class TheMostPowerfulWord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String incoming = scanner.nextLine();

        int countCurrentSymbol = 0; //брояч на букви от текущата дума
        int allSumSymbol = 0; //сбора на символите от текущата дума
        int bestSumSymbol = 0; //най-голямата сума от символи до момента
        String firstSymbol = ""; //пръвата буква
        String currentWord = ""; //текущата дума
        String bestWord = ""; //най-добрата дума

        while (!incoming.equals("End of words")){
            countCurrentSymbol = 0;
            currentWord = incoming;
            firstSymbol = incoming.split("")[0];

            for (int currentSymbol = 0; currentSymbol < incoming.length(); currentSymbol++) { //обхожда всяка буква от текущата дума
                char symbol = incoming.charAt(currentSymbol); //превръщане на indexa в символ
                countCurrentSymbol += (int) symbol; //сумиране стойността на всеки конкретен символ според ASCII таблицата
            }

            if (firstSymbol.equals("a") || firstSymbol.equals("e") || firstSymbol.equals("i")
                    || firstSymbol.equals("o") || firstSymbol.equals("u") || firstSymbol.equals("y")
            || firstSymbol.equals("A") || firstSymbol.equals("E") || firstSymbol.equals("I")
                    || firstSymbol.equals("O") || firstSymbol.equals("U") || firstSymbol.equals("Y")){
                allSumSymbol = countCurrentSymbol * incoming.length();
            }else {
                allSumSymbol = Math.abs(countCurrentSymbol / incoming.length());
            }

            if(bestSumSymbol <= allSumSymbol){ //проверка текущата дума дали е най-добрата дума
                bestSumSymbol = allSumSymbol;
                bestWord = currentWord;
            }

            incoming = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %d", bestWord, bestSumSymbol);
    }
}
