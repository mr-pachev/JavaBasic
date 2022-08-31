package Exam_01;

import java.util.Scanner;

public class CoffeeMachine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hotDrink = scanner.nextLine(); //вид напитка
        String sugar = scanner.nextLine(); //добавка захар
        int quantity = Integer.parseInt(scanner.nextLine()); //брой напитки
        double productPrice = 0;
        double diff = 0;

        if(hotDrink.equals("Espresso")) {
            if (sugar.equals("Without")) {
                diff = 0.9 * 0.35;
                productPrice = quantity * (0.9 - diff);
            } else if (sugar.equals("Normal")) {
                productPrice = quantity * 1.0;
            } else if (sugar.equals("Extra")) {
                productPrice = quantity * 1.20;
            }

            if(quantity >= 5){ //проверка дали важи отстъката за над 5 броя
                diff = productPrice * 0.25;
                productPrice = productPrice - diff;
            }
        }else if(hotDrink.equals("Cappuccino")) {
            if (sugar.equals("Without")) {
                diff = 1.0 * 0.35;
                productPrice = quantity * (1.0 - diff);
            } else if (sugar.equals("Normal")) {
                productPrice = quantity * 1.20;
            } else if (sugar.equals("Extra")) {
                productPrice = quantity * 1.60;
            }
        }else if(hotDrink.equals("Tea")) {
            if (sugar.equals("Without")) {
                diff = 0.5 * 0.35;
                productPrice = quantity * (0.5 - diff);
            } else if (sugar.equals("Normal")) {
                productPrice = quantity * 0.60;
            } else if (sugar.equals("Extra")) {
                productPrice = quantity * 0.70;
            }
        }

        if(productPrice > 15){ //проверка дали стойността надвишава 15лв и да се поозва отстъпка 20%
            diff = productPrice * 0.2;
            productPrice = productPrice - diff;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", quantity, hotDrink, productPrice);
    }
}
