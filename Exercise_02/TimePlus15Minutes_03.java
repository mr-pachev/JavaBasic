package Exercise_02;

import java.util.Scanner;

public class TimePlus15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int allMints = (hour * 60) + min + 15;
        int newHours = allMints / 60;
        int newMints = allMints % 60;

        if (newHours > 23){
            newHours = 0;
            System.out.printf("%d:%02d", newHours, newMints);
        }else {
            System.out.printf("%d:%02d", newHours, newMints);
        }
    }
}
