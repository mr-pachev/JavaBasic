package Exam_06;

import java.util.Scanner;

public class EasterEggsBattle_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPlayerEggs = Integer.parseInt(scanner.nextLine()); //брой яйца на първи играч
        int secondPlayerEggs = Integer.parseInt(scanner.nextLine()); //брой яйцана втория играч
        String command = scanner.nextLine();
        boolean isEmpty = false;

        while (!command.equals("End")){
            if (command.equals("one")){
                secondPlayerEggs--;
                if (secondPlayerEggs <= 0){
                    System.out.printf("Player two is out of eggs. Player one has %d eggs left.",firstPlayerEggs);
                    isEmpty = true;
                      break;
                }
            }else if (command.equals("two")){
                firstPlayerEggs--;
                if (firstPlayerEggs <= 0){
                    System.out.printf("Player one is out of eggs. Player two has %d eggs left.", secondPlayerEggs);
                    isEmpty = true;
                    break;
                }
            }

            command = scanner.nextLine();
        }

        if (!isEmpty){
            System.out.printf("Player one has %d eggs left.%n", firstPlayerEggs);
            System.out.printf("Player two has %d eggs left.", secondPlayerEggs);
        }

    }
}
