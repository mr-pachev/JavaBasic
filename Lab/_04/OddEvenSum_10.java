package Lab._04;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int evenNum = 0;
        int oddNum = 0;
        int curentNum = 0;
        for (int i = 1; i <= n; i++){
            curentNum = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0){
                evenNum = evenNum + curentNum;
            }else {
                oddNum = oddNum + curentNum;
            }
        }
        if (evenNum == oddNum) {
            System.out.printf("Yes%nSum = %d", evenNum);
        }else {
            System.out.printf("No%nDiff = %d", Math.abs(evenNum - oddNum));
        }
    }
}
