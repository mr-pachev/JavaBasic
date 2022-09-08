package Exam_03;

import java.util.Scanner;

public class Series_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()); //бюджет
        int serialsSum = Integer.parseInt(scanner.nextLine()); //брой на сериалите

        String serialName = ""; //име на текущия сериал
        double serialPrice = 0; //цена на текущия сериал

        double diff = 0;
        boolean isEnough = true;
        double  negativAllPrice = 0; //сбор на сумите на сериалите над бюджета

        for (int serialCount = 1; serialCount <= serialsSum; serialCount++) {
            serialName = scanner.nextLine();
            serialPrice = Double.parseDouble(scanner.nextLine());

            //проверка за намаление
            if (serialName.equals("Thrones")){
                diff = 50 * 1.0 / 100 * serialPrice;
                serialPrice -= diff;
            }else if (serialName.equals("Lucifer")){
                diff = 40 * 1.0 / 100 * serialPrice;
                serialPrice -= diff;
            }else if (serialName.equals("Protector")){
                diff = 30 * 1.0 / 100 * serialPrice;
                serialPrice -= diff;
            }else if (serialName.equals("TotalDrama")){
                diff = 20 * 1.0 / 100 * serialPrice;
                serialPrice -= diff;
            }else if (serialName.equals("Area")){
                diff = 10 * 1.0 / 100 * serialPrice;
                serialPrice -= diff;
            }

            if(isEnough) { //проверка дали сумата на сериала вече не е надвишила  юджета
                if (budget >= serialPrice) { //проверка дали все още бюджета е достатъчен
                    budget -= serialPrice;
                } else {
                    negativAllPrice = serialPrice - budget;
                    isEnough = false;

                }
            }else {
                negativAllPrice += serialPrice;
            }

        }

        if (!isEnough){
            System.out.printf("You need %.2f lv. more to buy the series!",  negativAllPrice);
        }else {
            System.out.printf("You bought all the series and left with %.2f lv.", budget);
        }

    }
}
