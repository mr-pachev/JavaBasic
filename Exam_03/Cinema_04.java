package Exam_03;

import java.util.Scanner;

public class Cinema_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallCapacity = Integer.parseInt(scanner.nextLine()); //капацитет на залата
        String incoming = scanner.nextLine(); //вход от конзолата за текущата операция

        int allPrice = 0;
         boolean isFull = false;

        while (!incoming.equals("Movie time!")){
            int incomingPeople = Integer.parseInt(incoming); //брой влезнали хора
            hallCapacity -= incomingPeople;

            if (hallCapacity >= 0){
                allPrice += incomingPeople * 5;

                if (incomingPeople % 3 == 0){ //проверка дали ще се изпоозва намалението от 5 лв.
                    allPrice -= 5;
                }

            }else{
                isFull = true;
                break;
            }

            incoming = scanner.nextLine();
        }

        if (isFull){
            System.out.println("The cinema is full.");
        }else{
            System.out.printf("There are %d seats left in the cinema.%n", hallCapacity);
        }

        System.out.printf("Cinema income - %d lv.", allPrice);

    }
}
