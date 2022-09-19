package Exam_05;

import java.util.Scanner;

public class Gymnastics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine(); //държава
        String device = scanner.nextLine(); //уред за изпълнение

        double allPoints = 0; //точки за дадената държава
        double percent = 0; //процент спрямо максимума 20

        if (country.equals("Russia")){
            if (device.equals("ribbon")){
                allPoints = 9.100 + 9.400;
            }else if (device.equals("hoop")){
                allPoints = 9.300 + 9.800;
            }else if ( device.equals("rope")){
                allPoints = 9.600 + 9.000;
            }
        }else if (country.equals("Bulgaria")){
            if (device.equals("ribbon")){
                allPoints = 9.600 + 9.400;
            }else if (device.equals("hoop")){
                allPoints = 9.550 + 9.750;
            }else if ( device.equals("rope")){
                allPoints = 9.500 + 9.400;
            }
        }else if (country.equals("Italy")){
            if (device.equals("ribbon")){
                allPoints = 9.200 + 9.500;
            }else if (device.equals("hoop")){
                allPoints = 9.450 + 9.350;
            }else if ( device.equals("rope")){
                allPoints = 9.700 + 9.150;
            }
        }

        percent = 20 - allPoints;
        percent = percent * 100 / 20;

        System.out.printf("The team of %s get %.3f on %s.%n", country, allPoints, device);
        System.out.printf("%.2f%%", percent);
    }
}
