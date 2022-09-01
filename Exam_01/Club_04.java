package Exam_01;

import java.util.Scanner;

public class Club_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double expectedProfi = Double.parseDouble(scanner.nextLine()); //очаквана печалба
        String incoming = scanner.nextLine();
        double profit = 0; //печалба общо от всички поръчки
        double diff = 0; //намелие от 25%
        boolean isTarget = false;
        double cocktailPrice = 0; //цена на дадения коктейл
        double allCocktailPrice = 0; //цена на всички дадени коктейли

        while (!incoming.equals("Party!") && profit < expectedProfi){
            String cocktailName = incoming;
            int  countCocktail = Integer.parseInt(scanner.nextLine());

            cocktailPrice =  cocktailName.length();
            allCocktailPrice =  cocktailPrice * countCocktail;

            if(allCocktailPrice % 2 != 0){ //проверка поръчката може ли да използва намаление
                diff = allCocktailPrice * 0.25;
                allCocktailPrice = allCocktailPrice - diff;
            }
            profit += allCocktailPrice;

            if (profit >= expectedProfi){ //проверка дали е достигната очакванатапечалба
                isTarget = true;
            }

            if(!isTarget) { //проверка дали да върти while цикъла, ако е достигната очакваната печалба спира
                incoming = scanner.nextLine();
            }
        }

        if(!isTarget){
            System.out.printf("We need %.2f leva more.%n", expectedProfi - profit);
        }else {
            System.out.println("Target acquired.");
        }

        System.out.printf("Club income - %.2f leva.", profit);
    }
}
