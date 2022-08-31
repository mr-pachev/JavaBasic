package Exam_01;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int overnights = Integer.parseInt(scanner.nextLine());
        double priceOvernight = Double.parseDouble(scanner.nextLine());
        double percentAdditionalCosts = Double.parseDouble(scanner.nextLine());

        double allPriceOvernight = 0;

        //изчисления разходи
        if (overnights > 7){
            double discount = priceOvernight * 0.05; //отстъката от 5% от цената на една  нощувка
            priceOvernight = priceOvernight - discount;
            allPriceOvernight = overnights * priceOvernight;
        }else {
            allPriceOvernight = overnights * priceOvernight;
        }

        double sumAdditionalCost = budget * (percentAdditionalCosts / 100); //сума за допълнителни разходи от бюджета
        double allExpenses = allPriceOvernight + sumAdditionalCost;

        if(allExpenses <= budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - allExpenses);
        }else {
            System.out.printf("%.2f leva needed.", allExpenses - budget);
        }

    }
}
