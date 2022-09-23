package Exam_06;

import java.util.Scanner;

public class EasterParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumGuest = Integer.parseInt(scanner.nextLine()); //брой гости
        double envelopePrice = Double.parseDouble(scanner.nextLine()); //цена на куверт за един човек
        double budget = Double.parseDouble(scanner.nextLine()); //бюджет на Деси

        double diffEnveloperPrice = 0; //отстъпка от куверта за един човек
        double allPrice = 0;
        double cake = 10 * 1.0 / 100 * budget; //цена на тортата
        double priceAllPeopleEnveloper = 0; //цена за куверти на всични гости

        if (sumGuest >= 10 && sumGuest <= 15){ //проверка за отстъпка от куверта за един човек
            diffEnveloperPrice = 15 * 1.0 / 100 * envelopePrice;
        }else if (sumGuest > 15 && sumGuest <= 20){
            diffEnveloperPrice = 20 * 1.0 / 100 * envelopePrice;
        }else if (sumGuest > 20){
            diffEnveloperPrice = 25 * 1.0 / 100 * envelopePrice;
        }

        priceAllPeopleEnveloper = sumGuest * (envelopePrice - diffEnveloperPrice);
        allPrice = priceAllPeopleEnveloper + cake;

        if (allPrice <= budget){
            System.out.printf("It is party time! %.2f leva left.", budget - allPrice);
        }else {
            System.out.printf("No party! %.2f leva needed.", allPrice - budget);
        }
    }
}
