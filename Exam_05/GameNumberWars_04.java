package Exam_05;

import java.util.Scanner;

public class GameNumberWars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playersOneName = scanner.nextLine(); //името на първия играч
        String playersTwoName = scanner.nextLine(); //името на втория играч
        String input = scanner.nextLine();

        int firstPlayerPoints = 0;
        int secondPlayerPoints = 0;
        boolean isDone = false;

        while (!input.equals("End of game")){
            int firstPlayerCard = Integer.parseInt(input); //карта на първия играч
            int secondPlayerCard = Integer.parseInt(scanner.nextLine()); //карта на втория играч

            if (firstPlayerCard > secondPlayerCard){
                firstPlayerPoints += firstPlayerCard - secondPlayerCard;
            }else if (secondPlayerCard > firstPlayerCard){
                secondPlayerPoints += secondPlayerCard - firstPlayerCard;
            }else {
                firstPlayerCard = Integer.parseInt(scanner.nextLine());
                secondPlayerCard = Integer.parseInt(scanner.nextLine());

                if (firstPlayerCard > secondPlayerCard){

                    System.out.println("Number wars!");
                    System.out.printf("%s is winner with %d points", playersOneName, firstPlayerPoints);
                }else if (secondPlayerCard > firstPlayerCard){

                    System.out.println("Number wars!");
                    System.out.printf("%s is winner with %d points", playersTwoName, secondPlayerPoints);
                }
                isDone = true;
                break;
            }

            input = scanner.nextLine();
        }

if (!isDone){
    System.out.printf("%s has %d points%n", playersOneName, firstPlayerPoints);
    System.out.printf("%s has %d points", playersTwoName, secondPlayerPoints);
}


    }
}
