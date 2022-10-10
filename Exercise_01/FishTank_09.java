package Exercise_01;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenght = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double content = Double.parseDouble(scanner.nextLine());

        double allVolume = (lenght * width * height) / 1000;
        double volume = allVolume - (allVolume * content / 100);

        System.out.println(volume);

    }
}
