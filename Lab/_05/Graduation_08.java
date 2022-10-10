package Lab._05;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double countNotes = 0;
        double lowGrade = 0;
        int trainingClass = 1;
        boolean isValid = true;

        while (trainingClass <= 12) {
            if (lowGrade == 2) {
                break;
            }

            double input = Double.parseDouble(scanner.nextLine());

            if (input < 4) {
                lowGrade++;
                isValid = false;
                continue;
            }
            if (input >= 4) {
                countNotes = countNotes + input;
                trainingClass = trainingClass + 1;
            }
        }

        if (isValid) {
            System.out.printf("%s graduated. Average grade: %.2f", name, countNotes / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, trainingClass);
        }

    }
}
