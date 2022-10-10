package Lab._06;

import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floor = Integer.parseInt(scanner.nextLine());   // въвежда се брой етажи
        int rooms = Integer.parseInt(scanner.nextLine());   // въвеждат брой стои

        for (int i = floor; i >= 1; i--) {  // цикъл етажи, започва от последния етаж
            String typeRoom = "";

            if (i == floor) {   // проверка етажа дали е последе или само един
                typeRoom = "L";
            } else if (i % 2 == 0) {    // проверка етажа дали и четен
                typeRoom = "O";
            } else {    // остоналите случаи - нечетен номер етаж
                typeRoom = "A";
            }
            for (int j = 0; j < rooms; j++) {   // цикъл стои, започва от нулевия номер стоя
                System.out.printf("%s%d%d ", typeRoom, i, j);
            }
            System.out.println();
        }
    }
}
