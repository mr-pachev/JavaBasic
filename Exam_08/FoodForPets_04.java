package Exam_08;

import java.util.Scanner;

public class FoodForPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumDaysEating = Integer.parseInt(scanner.nextLine()); //брой дни ядене
        double allAmountFood = Double.parseDouble(scanner.nextLine()); // общо количество храна за всички дни
        double counterEatingBiscuits = 0; //количесто изядени бисквити
        int counterDogEating = 0; //общо храна изядена от кучето
        int counterCatEating = 0; //общо храна изядена от котката
        int allFoodsEating = 0; //общо изядена храна от кучето и котката

        for (int currentDay = 1; currentDay <= sumDaysEating; currentDay++) {
            int dogEat = Integer.parseInt(scanner.nextLine()); //храна изядена от кучето за деня
            int catEat = Integer.parseInt(scanner.nextLine()); //хран изядена от котката за дена
            int dailyEatsFood = dogEat + catEat;

            counterDogEating += dogEat;
            counterCatEating += catEat;

            if (currentDay % 3 == 0){
                counterEatingBiscuits += 10 * 1.0 / 100 * dailyEatsFood;
            }

        }

        allFoodsEating = counterDogEating + counterCatEating;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", Math.abs(counterEatingBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", (allFoodsEating * 1.0 / allAmountFood * 100));
        System.out.printf("%.2f%% eaten from the dog.%n", (counterDogEating * 1.0 / allFoodsEating * 100));
        System.out.printf ("%.2f%% eaten from the cat.", (counterCatEating * 1.0 / allFoodsEating * 100));
    }
}
