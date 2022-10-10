package Exercise_01;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

//        •	Предпазен найлон - 1.50 лв. за кв. метър
//        •	Боя - 14.50 лв. за литър
//        •	Разредител за боя - 5.00 лв. за литър

        double nylonCount = (nylon + 2) * 1.50;
        double paintCountSup = paint * 0.1;
        double paintCount = (paintCountSup + paint) * 14.50;
        double thinnerCount = thinner * 5.00;
        double allMaterialsCount = nylonCount + paintCount + thinnerCount + 0.4;
        double oneHourPrice = allMaterialsCount * 30 / 100;
        double allHoursPrice = oneHourPrice * hours * 1.0;
        double allPrice = allMaterialsCount + allHoursPrice;

        System.out.println(allPrice);




    }
}
