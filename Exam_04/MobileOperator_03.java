package Exam_04;

import java.util.Scanner;

public class MobileOperator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String termOfContract = scanner.nextLine(); //срок на договора
        String typeOfContract = scanner.nextLine(); //тип на договора
        String mobileInternet = scanner.nextLine(); //мобилен интернет
        int countMountOfPay = Integer.parseInt(scanner.nextLine()); //брой мевеци за плащане

        double fee = 0; //такса за договора

        if (termOfContract.equals("one")){ //договор за една година

            //тип на договора
            if (typeOfContract.equals("Small")){
                fee = 9.98;
            }else if (typeOfContract.equals("Middle")){
                fee = 18.99;
            }else if (typeOfContract.equals("Large")){
                fee = 25.98;
            }else if (typeOfContract.equals("ExtraLarge")){
                fee = 35.99;
            }

            if (mobileInternet.equals("yes")){
                if (fee <= 10){
                    fee += 5.50;
                }else if (fee <= 30){
                    fee += 4.35;
                }else {
                    fee += 3.85;
                }
            }

        }else if (termOfContract.equals("two")){ //договор за две години

            //тип на договора
            if (typeOfContract.equals("Small")){
                fee = 8.58;
            }else if (typeOfContract.equals("Middle")){
                fee = 17.09;
            }else if (typeOfContract.equals("Large")){
                fee = 23.59;
            }else if (typeOfContract.equals("ExtraLarge")){
                fee = 31.79;
            }

            if (mobileInternet.equals("yes")){
                if (fee <= 10){
                    fee += 5.50;
                }else if (fee <= 30){
                    fee += 4.35;
                }else {
                    fee += 3.85;
                }
            }

            fee -= 3.75 / 100 * fee;
        }
        System.out.printf("%.2f lv.", fee * countMountOfPay);
    }
}
