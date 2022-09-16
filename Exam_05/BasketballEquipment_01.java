package Exam_05;

import java.util.Scanner;

public class BasketballEquipment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualBasketballFee = Integer.parseInt(scanner.nextLine()); //годишна такса за баскетбол

        double basketballShoes = annualBasketballFee;
        basketballShoes -= 40 * 1.0 / 100 * annualBasketballFee; //баскетболни кецове

        double basketballGear = basketballShoes;
        basketballGear -= 20 * 1.0 / 100 * basketballGear; //баскетболна екипировка

        double basketball = basketballGear / 4; //баскетболна топка
        double basketballAccessories = basketball / 5; //баскетболни аксесоари

        double allExpenses = annualBasketballFee + basketballShoes + basketballGear + basketball + basketballAccessories;

        System.out.printf("%.2f", allExpenses);
    }
}
