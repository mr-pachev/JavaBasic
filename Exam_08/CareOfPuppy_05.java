package Exam_08;

import java.util.Scanner;

public class CareOfPuppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumFoods = Integer.parseInt(scanner.nextLine()); //количество храна за кучето
        sumFoods *= 1000;

        String command = scanner.nextLine();

        int counetrEatingFoods = 0; //общо количество изядена храна
        int eatingFoods = 0; //количество храна, което е изяло кучето за деня

        while (!command.equals("Adopted")){
            eatingFoods = Integer.parseInt(command);
            counetrEatingFoods += eatingFoods;

            command = scanner.nextLine();
        }
        if (sumFoods >= counetrEatingFoods){
            System.out.printf("Food is enough! Leftovers: %d grams.", sumFoods - counetrEatingFoods);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", counetrEatingFoods - sumFoods);
        }
    }
}
