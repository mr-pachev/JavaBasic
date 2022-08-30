package MoreExercises_07;

import java.util.Scanner;

public class TheSongOfTheWheels_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int fourthDigit = 0;
        int treedDigit = 0;
        int secondDigit = 0;
        int firstDigit = 0;
        boolean isValid = false;
        boolean isNewLine = false;

        for (int a = 1; a <= 9; a++){
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {

                        if(a < b){
                            if(c > d){
                                if((a*b) + (c*d) == num) {
                                    counter++;
                                    isNewLine = true;
                                    System.out.printf("%d%d%d%d ", a, b, c, d);
                                    if  (counter == 4){
                                        fourthDigit = a;
                                        treedDigit = b;
                                        secondDigit = c;
                                        firstDigit = d;
                                        isValid = true;
                                        isNewLine = false;
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
        if(isNewLine){
            System.out.println();
        }
if(!isValid){
    System.out.println("No!");
}else {
    System.out.printf("Password: %d%d%d%d", fourthDigit, treedDigit, secondDigit, firstDigit);
}

    }
}
