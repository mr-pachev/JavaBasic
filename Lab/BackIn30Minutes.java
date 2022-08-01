package Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int hoursToMin = hours * 60;
        int allMin = hoursToMin + min + 30;

        int afterHour = allMin / 60;
        int afterMin = allMin % 60;

        if (afterHour > 23){
            afterHour = 0;
            System.out.printf("%d:%02d", afterHour, afterMin);
        }else {
            System.out.printf("%d:%02d", afterHour, afterMin);
        }
    }
}
