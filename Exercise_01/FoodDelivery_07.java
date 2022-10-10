package Exercise_01;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());
//        •	Пилешко меню –  10.35 лв.
//        •	Меню с риба – 12.40 лв.
//        •	Вегетарианско меню  – 8.15 лв.

        double chickenCount = chicken * 10.35;
        double fishCount = fish * 12.40;
        double veganCount = vegan * 8.15;
        double mealCount = chickenCount + fishCount + veganCount;
        double dessert = mealCount * 0.20;
        double orderCount = mealCount + dessert + 2.50;

        System.out.println(orderCount);


    }
}
