package Exam_03;

import java.util.Scanner;

public class MovieStars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double actorsBudget = Double.parseDouble(scanner.nextLine()); //бюджет за актьори
        String actor = scanner.nextLine(); //текущия актьор

        boolean isEmpty = false;
        double currentActorsRemuneration = 0;

        while (!actor.equals("ACTION")){

            //хонорар на текущия актьор
            if (actor.length() > 15){
                currentActorsRemuneration = 20 * 1.0 / 100 * actorsBudget;
            }else {
                currentActorsRemuneration = Double.parseDouble(scanner.nextLine());
            }

            if (actorsBudget >= currentActorsRemuneration){
                actorsBudget -= currentActorsRemuneration;
                actor = scanner.nextLine();
            }else {
                currentActorsRemuneration -= actorsBudget;
                isEmpty = true;
                break;
            }

        }

        if(isEmpty){
            System.out.printf("We need %.2f leva for our actors.%n", currentActorsRemuneration);
        }else {
            System.out.printf("We are left with %.2f leva.", actorsBudget);
        }
    }
}
