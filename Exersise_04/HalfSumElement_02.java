package Exersise_04;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumb = Integer.MIN_VALUE;
        int count = 0;
        int balanceCount = 0;

        for (int i = 1; i <= n; i++){
            int curentNum = Integer.parseInt(scanner.nextLine());
            count = count + curentNum;

            if (maxNumb < curentNum){
                maxNumb = curentNum;
            }
        }
        balanceCount = count - maxNumb;
        if (maxNumb == balanceCount){
            System.out.printf("Yes%nSum = %d", maxNumb);
        }else {
            System.out.printf("No%nDiff = %d", Math.abs(maxNumb -balanceCount));
        }

    }
}
