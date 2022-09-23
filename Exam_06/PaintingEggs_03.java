package Exam_06;

import java.util.Scanner;

public class PaintingEggs_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eggSize = scanner.nextLine(); //размер на яйцата
        String eggColor = scanner.nextLine(); //цвят на яйцата
        int numberOfLots = Integer.parseInt(scanner.nextLine()); //брой партиди

        double allPrice = 0;
        double productionCost = 0;

        if (eggSize.equals("Large")){
            if (eggColor.equals("Red")){
                allPrice = numberOfLots * 16;
            }else if (eggColor.equals("Green")){
                allPrice = numberOfLots * 12;
            }else if (eggColor.equals("Yellow")){
                allPrice = numberOfLots * 9;
            }
        }else if (eggSize.equals("Medium")){
            if (eggColor.equals("Red")){
                allPrice = numberOfLots * 13;
            }else if (eggColor.equals("Green")){
                allPrice = numberOfLots * 9;
            }else if (eggColor.equals("Yellow")){
                allPrice = numberOfLots * 7;
            }
        }else if (eggSize.equals("Small")){
            if (eggColor.equals("Red")){
                allPrice = numberOfLots * 9;
            }else if (eggColor.equals("Green")){
                allPrice = numberOfLots * 8;
            }else if (eggColor.equals("Yellow")){
                allPrice = numberOfLots * 5;
            }
        }
        productionCost = 35 * 1.0 / 100 * allPrice;
        allPrice -= productionCost;

        System.out.printf("%.2f leva.", allPrice);
    }
}
