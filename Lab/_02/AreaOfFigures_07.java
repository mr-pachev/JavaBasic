package Lab._02;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();

        if (shape.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double s = a * a;
            System.out.printf("%.3f", s);
        } else if (shape.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double s = a * b;
            System.out.printf("%.3f", s);
        } else if (shape.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double s = Math.PI * r * r;
            System.out.printf("%.3f", s);
        } else if (shape.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double s = a * h / 2;
            System.out.printf("%.3f", s);
        }

    }
}
