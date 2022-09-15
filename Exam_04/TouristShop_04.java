package Exam_04;

import java.util.Scanner;

public class TouristShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()); //бюджет
        String input = scanner.nextLine();

        String productName = ""; //име на продукта
        double productPrice = 0; //цена на продукта
        int productCounter = 0; //брояч на продуктите
        double allPrice = 0;
        boolean isEnough = true;

        while (!input.equals("Stop")){
            productCounter ++;
            productName = input;
            productPrice = Double.parseDouble(scanner.nextLine());

            if (productCounter % 3 == 0){
                productPrice /= 2;
            }

            if (productPrice > budget){ //проверка дали останалите пари от бюджета стигат за следващат покупка
                isEnough = false;
                break;
            }

            allPrice += productPrice;
            budget -= productPrice;

            input = scanner.nextLine();
        }


        if (!isEnough){
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", productPrice - budget);
        }else{
            System.out.printf("You bought %d products for %.2f leva.%n", productCounter, allPrice);
        }
    }
}
