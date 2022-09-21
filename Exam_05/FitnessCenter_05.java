package Exam_05;

import java.util.Scanner;

public class FitnessCenter_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumVisitors = Integer.parseInt(scanner.nextLine()); //брой посетители на фитнес
        int countPeopleBoughtProduct = 0; //брой хора купили продукт от фитнеса
        int counterBack = 0; //брояч хора тренирали гръб
        int counterChest = 0; //брояч на хора трениращи гърди
        int counterLegs = 0; //брояч хора трениращи крака
        int counterAbs = 0; //брояч хора трениращи коремни мускули
        int counterProteinShake = 0; //брояч хора купили протейнов шейк
        int counterProteinBar = 0; //брояч хора купили протейнов бар

        for (int currentVisitor = 1; currentVisitor <= sumVisitors; currentVisitor++) {
            String input = scanner.nextLine();

            if (input.equals("Back")){
                counterBack++;
            }else if (input.equals("Chest")){
                counterChest++;
            }else if (input.equals("Legs")){
                counterLegs++;
            }else if (input.equals("Abs")){
                counterAbs++;
            }else if (input.equals("Protein shake")){
                counterProteinShake++;
                countPeopleBoughtProduct++;
            }else if (input.equals("Protein bar")){
                counterProteinBar++;
                countPeopleBoughtProduct++;
            }

        }

        System.out.printf("%d - back%n", counterBack);
        System.out.printf("%d - chest%n", counterChest);
        System.out.printf("%d - legs%n", counterLegs);
        System.out.printf("%d - abs%n", counterAbs);
        System.out.printf("%d - protein shake%n", counterProteinShake);
        System.out.printf("%d - protein bar%n", counterProteinBar);
        System.out.printf("%.2f%% - work out%n", (counterBack + counterChest + counterLegs + counterAbs) * 1.0 /sumVisitors  * 100);
        System.out.printf("%.2f%% - protein", (counterProteinShake + counterProteinBar) * 1.0 / sumVisitors  * 100);
    }
}
