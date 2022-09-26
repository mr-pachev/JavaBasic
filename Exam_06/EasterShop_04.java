package Exam_06;

import java.util.Scanner;

public class EasterShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumEggs = Integer.parseInt(scanner.nextLine()); //начална бройка на яйцата
        String input = scanner.nextLine();
        int counterBuyEggs = 0;
        boolean isEmpty = false;

        while (!input.equals("Close")) {
            String command = input; //команда за допълване или купуване на яйца
            int currentNumEggs = Integer.parseInt(scanner.nextLine()); //количество яйца според командата

            if (command.equals("Buy")) {
                if (currentNumEggs <= startNumEggs) { //проверка дали исканите яйца за купуване ги има в наличност
                    startNumEggs -= currentNumEggs;
                    counterBuyEggs += currentNumEggs;

                } else {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", startNumEggs);
                    isEmpty = true;
                    break;
                }
            } else if (command.equals("Fill")) {
                startNumEggs += currentNumEggs;
            }

            input = scanner.nextLine();
        }

        if (!isEmpty) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", counterBuyEggs);
        }

    }
}
