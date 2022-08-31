package Exam_01;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class TravelAgency_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String packet = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double allPrice = 0;
        boolean isVald = true;

        double diff = 0;
        double priceOvernight = 0;

        if(city.equals("Bansko") || city.equals("Borovets")){
            if(packet.equals("noEquipment")){
                if(vip.equals("yes")){
                    diff = 80 * 0.05;
                    priceOvernight = 80 - diff;
                }else if(vip.equals("no")){
                    priceOvernight = 80;
                }
            }else if(packet.equals("withEquipment")){
                if(vip.equals("yes")){
                    diff = 100 * 0.1;
                    priceOvernight = 100 - diff;
                }else if(vip.equals("no")){
                    priceOvernight = 100;
                }
            }else {
                System.out.println("Invalid input!");
                isVald = false;
            }

        }else if(city.equals("Varna") || city.equals("Burgas")){
            if(packet.equals("noBreakfast")){
                if(vip.equals("yes")){
                    diff = 100 * 0.07;
                    priceOvernight = 100 - diff;
                }else if(vip.equals("no")){
                    priceOvernight = 100;
                }
            }else if(packet.equals("withBreakfast")){
                if(vip.equals("yes")){
                    diff = 130 * 0.12;
                    priceOvernight = 130 - diff;
                }else if(vip.equals("no")){
                    priceOvernight = 130;
                }
            }else {
                System.out.println("Invalid input!");
                isVald = false;
            }
        }else {
            System.out.println("Invalid input!");
            isVald = false;
        }

        if(days < 1){ //проверка дните да са положително число
            System.out.println("Days must be positive number!");
            isVald = false;
        }
        if(days > 7){ //проверка дали ще има намаление за резервация над 7 дни
            days--;
        }
        allPrice = priceOvernight * days;

        if(isVald) {
            System.out.printf("The price is %.2flv! Have a nice time!", allPrice);
        }
    }
}
