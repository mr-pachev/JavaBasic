package Exer._01;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tax = Integer.parseInt(scanner.nextLine());

//        •	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
//        •	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
//        •	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
//        •	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double sneakersDiscount = tax * 0.40;
        double sneakers = tax - sneakersDiscount;
        double outfitDiscount = sneakers * 0.20;
        double outfit = sneakers - outfitDiscount;
        double ball = outfit / 4;
        double accessories = ball / 5;
        double allCoast = tax + sneakers + outfit + ball + accessories;

        System.out.println(allCoast);

    }
}
