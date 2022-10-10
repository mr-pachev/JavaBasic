package Lab._06;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")){

            double neededSum = Double.parseDouble(scanner.nextLine());
            double counter = 0;

            while (counter < neededSum){
                double savedMoney= Double.parseDouble(scanner.nextLine());
                counter = counter + savedMoney;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }

    }
}
