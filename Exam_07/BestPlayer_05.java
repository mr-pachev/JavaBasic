package Exam_07;

import java.util.Scanner;

public class BestPlayer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playersName = scanner.nextLine(); //името на играча
        int countGoals = 0;
        int maxGoals = 0;
        String bestPlayer = "";
        boolean isTrue = false;

        while (!playersName.equals("END")){
            int currentGoals = Integer.parseInt(scanner.nextLine()); //текущо вкарани голове

            if (currentGoals < 10){
                if (currentGoals > maxGoals){
                    maxGoals = currentGoals;
                    bestPlayer = playersName;

                    if (currentGoals >= 3){
                        isTrue = true;
                    }
                }

            }else {
                if (currentGoals > maxGoals){
                    maxGoals = currentGoals;
                    bestPlayer = playersName;

                    if (currentGoals >= 3){
                        isTrue = true;
                    }
                }
                break;
            }

            playersName = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);

        if (!isTrue){
            System.out.printf("He has scored %d goals.", maxGoals);
        }else {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        }
    }
}
