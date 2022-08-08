package Lab;

import java.util.Scanner;

public class RectangleArea_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитаме две цели числа от конзолата
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int area = a * b;
        System.out.println(area);

    }
}

