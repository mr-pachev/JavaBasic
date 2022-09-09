package Exam_03;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorsName = scanner.nextLine(); //име на актьора
        double academyPoints = Double.parseDouble(scanner.nextLine()); //точки на академията
        int n = Integer.parseInt(scanner.nextLine()); //брой оценяващи

        double allPointsActor = academyPoints; //сума от всички точки събрани за актьора
        boolean isNominated = false;

        for (int current = 1; current <= n; current++) {
            String juryName = scanner.nextLine(); //име на оценяващия
            double rating = Double.parseDouble(scanner.nextLine()); //оценка на оценяващия

            allPointsActor += juryName.length() * rating / 2;

            if (allPointsActor > 1250.5){
                isNominated = true;
                break;
            }
        }
        if (isNominated){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorsName, allPointsActor);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!", actorsName, 1250.5 - allPointsActor);
        }
    }
}
