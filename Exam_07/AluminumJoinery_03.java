package Exam_07;

import java.util.Scanner;

public class AluminumJoinery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aluminum = Integer.parseInt(scanner.nextLine()); //брой дограми за правене
        String type = scanner.nextLine(); //размер на дограмата
        String delivery = scanner.nextLine(); //тип доставка

        double allPrice = 0;
        boolean isInsufficient = false;

        if (aluminum >= 10){

            if (type.equals("90X130")){
                allPrice = aluminum * 110;

                if (aluminum > 60){
                    allPrice -= 8 * 1.0 / 100 * allPrice;
                }else if (aluminum > 30){
                    allPrice -= 5 * 1.0 / 100 * allPrice;
                }
            }else if (type.equals("100X150")){
                allPrice = aluminum * 140;

                if (aluminum > 80){
                    allPrice -= 10 * 1.0 / 100 * allPrice;
                }else if (aluminum > 40){
                    allPrice -= 6 * 1.0 / 100 * allPrice;
                }
            }else if (type.equals("130X180")){
                allPrice = aluminum * 190;

                if (aluminum > 50){
                    allPrice -= 12 * 1.0 / 100 * allPrice;
                }else if (aluminum > 20){
                    allPrice -= 7 * 1.0 / 100 * allPrice;
                }
            }else if (type.equals("200X300")){
                allPrice = aluminum * 250;

                if (aluminum > 50){
                    allPrice -= 14 * 1.0 / 100 * allPrice;
                }else if (aluminum > 25){
                    allPrice -= 9 * 1.0 / 100 * allPrice;
                }
            }
        }else {
            isInsufficient = true;
            System.out.println("Invalid order");
        }

        if (delivery.equals("With delivery")){
            allPrice += 60;
        }

        if (aluminum > 99){
            allPrice -= 4 * 1.0 / 100 * allPrice;
        }

        if (!isInsufficient) {
            System.out.printf("%.2f BGN", allPrice);
        }
    }
}
