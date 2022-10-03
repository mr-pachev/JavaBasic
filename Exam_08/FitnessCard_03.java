package Exam_08;

import java.util.Scanner;

public class FitnessCard_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()); //бюджет
        String sex = scanner.nextLine(); //пол
        int age = Integer.parseInt(scanner.nextLine()); //възраст
        String sport = scanner.nextLine(); //вид спорт

        double allPrice = 0;

        if (sport.equals("Gym")){
            if (sex.equals("m")){
                allPrice = 42;
            }else if (sex.equals("f")){
                allPrice = 35;
            }
        }else if (sport.equals("Boxing")){
            if (sex.equals("m")){
                allPrice = 41;
            }else if (sex.equals("f")){
                allPrice = 37;
            }
        }else if (sport.equals("Yoga")){
            if (sex.equals("m")){
                allPrice = 45;
            }else if (sex.equals("f")){
                allPrice = 42;
            }
        }else if (sport.equals("Zumba")){
            if (sex.equals("m")){
                allPrice = 34;
            }else if (sex.equals("f")){
                allPrice = 31;
            }
        }else if (sport.equals("Dances")){
            if (sex.equals("m")){
                allPrice = 51;
            }else if (sex.equals("f")){
                allPrice = 53;
            }
        }else if (sport.equals("Pilates")){
            if (sex.equals("m")){
                allPrice = 39;
            }else if (sex.equals("f")){
                allPrice = 37;
            }
        }

        if (age <= 19){
            allPrice -= 20 * 1.0 / 100 * allPrice;
        }

        if (allPrice <= budget){
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }else {
            System.out.printf("You don't have enough money! You need $%.2f more.", allPrice - budget);
        }
    }
}
