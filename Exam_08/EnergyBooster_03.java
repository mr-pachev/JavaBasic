package Exam_08;

import java.util.Scanner;

public class EnergyBooster_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine(); //плод
        String setSize = scanner.nextLine(); //размер на сета
        int numSets = Integer.parseInt(scanner.nextLine()); //брой поръчани сетове

        double allPrice = 0;

        if (fruit.equals("Watermelon")){
            if (setSize.equals("small")){
                allPrice = 2 * 56;
            }else if (setSize.equals("big")){
                allPrice = 5 * 28.70;
            }
        }else if (fruit.equals("Mango")){
            if (setSize.equals("small")){
                allPrice = 2 * 36.66;
            }else if (setSize.equals("big")){
                allPrice = 5 * 19.60;
            }
        }else if (fruit.equals("Pineapple")){
            if (setSize.equals("small")){
                allPrice = 2 * 42.10;
            }else if (setSize.equals("big")){
                allPrice = 5 * 24.80;
            }
        }else if (fruit.equals("Raspberry")){
            if (setSize.equals("small")){
                allPrice = 2 * 20;
            }else if (setSize.equals("big")){
                allPrice = 5 * 15.20;
            }
        }
        allPrice *= numSets;

        if (allPrice >= 400 && allPrice <= 1000){
            allPrice -= 15 * 1.0 / 100 * allPrice;
        }else if (allPrice > 1000){
            allPrice -= 50 * 1.0 / 100 * allPrice;
        }

        System.out.printf("%.2f lv.", allPrice);
    }
}
