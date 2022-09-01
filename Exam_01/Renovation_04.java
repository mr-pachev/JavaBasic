package Exam_01;

import java.util.Scanner;

public class Renovation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int areaNoPainPercent = Integer.parseInt(scanner.nextLine()); //процент от общата площ,която няма да се боядисва
        String incoming = scanner.nextLine();
        double paintArea = 0; //текуща боядисана площ
        boolean isPaint = false;
        double allPaintArea = 0; //общо боядисана площ

        //изчисление площа за боядисване
        double areaForPain = height * width * 4;
        double areaNoPain = areaForPain * (areaNoPainPercent * 1.0/ 100); //площ, която няма да се боядисва
        areaForPain = Math.ceil(areaForPain - areaNoPain); //общо площ за боядисване на една стая с 4 стени

        while (!incoming.equals("Tired!") && (allPaintArea < areaForPain)){
            paintArea = Double.parseDouble(incoming);

            allPaintArea += paintArea;

            if (areaForPain < allPaintArea){ //проверка боядисана площ да не е по-голяма от площа за боядисване
                isPaint = true;
            }

            if (!isPaint) {
                incoming = scanner.nextLine();
            }
        }
        if (!isPaint){ //проверка дали се е изморил преди да боядиса всички стени
            System.out.printf("%.0f quadratic m left.%n", areaForPain - allPaintArea);
        }else { //когато са боядисани всички стени
            if (allPaintArea - areaForPain > 0){ //проверка дали е останала боя
                System.out.printf("All walls are painted and you have %.0f l paint left!%n", allPaintArea - areaForPain);
            }else {
                System.out.println("All walls are painted! Great job, Pesho!");
            }
        }

    }
}
