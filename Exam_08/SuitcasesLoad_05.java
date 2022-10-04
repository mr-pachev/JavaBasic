package Exam_08;

import java.util.Scanner;

public class SuitcasesLoad_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trunkCapacity = Double.parseDouble(scanner.nextLine()); //капацитет на багажника
        String input = scanner.nextLine();
        boolean isFull = false;
        int counterSuitcase = 0;

        while (!input.equals("End")){
            double suitcaseVolume = Double.parseDouble(input); //обем на куфара
            counterSuitcase++;

            if (counterSuitcase % 3 == 0){
                suitcaseVolume += 10 * 1.0 / 100 * suitcaseVolume;
            }

            if (trunkCapacity < suitcaseVolume){
                System.out.println("No more space!");
                counterSuitcase--;
                isFull = true;
                break;
            }else {

                trunkCapacity -= suitcaseVolume;
            }

            input = scanner.nextLine();
        }
        if (!isFull){
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", counterSuitcase);

    }
}
