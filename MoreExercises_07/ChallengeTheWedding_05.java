package MoreExercises_07;

import java.util.Scanner;

public class ChallengeTheWedding_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int f = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int counterMeeting = 0;

        for (int male = 1; male <= m; male++) { //брояч за мъжета
            for (int female = 1; female <= f; female++) { //брояч за жените
                counterMeeting++; //брояч за срещите
                if (counterMeeting <= tables){ //условие дали има свободна маса за текущата среща
                    System.out.printf("(%d <-> %d) ", male, female);
                }
            }
        }

    }
}
