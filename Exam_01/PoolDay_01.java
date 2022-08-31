package Exam_01;

import java.util.Scanner;

public class PoolDay_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entrancePrice = Double.parseDouble(scanner.next());
        double sunLoungerPrice = Double.parseDouble(scanner.next());
        double sunUmbrella = Double.parseDouble(scanner.next());

        double necessarySunUmbrella = Math.ceil(people * 1.0 / 2); //необходими чадъри
        double necessarySunLounger = Math.ceil(people * 0.75); //необходими шезлонги

        //изчисления разходи
        double allEntrancePrice = people * entrancePrice; //общо пари за вход
        double allSunLongerPrice = necessarySunLounger * sunLoungerPrice; //цена за всички шезлонги
        double allSunUmbrellaPrice = necessarySunUmbrella * sunUmbrella; //цена за всички чадъри
        double allPrice = allEntrancePrice + allSunLongerPrice + allSunUmbrellaPrice;

        System.out.printf("%.2f lv.", allPrice);

    }
}
