package Exam_08;

import java.util.Scanner;

public class ChangeBureau_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumBitcoins = Integer.parseInt(scanner.nextLine()); //брой биткойни
        double sumChineseYuan = Double.parseDouble(scanner.nextLine()); //брой китайски юана
        double commission = Double.parseDouble(scanner.nextLine()); //комисионна

        double yuanTo = sumChineseYuan * 0.15;//юана в долара
        yuanTo = yuanTo * 1.76; //доларите в лева
        yuanTo += sumBitcoins * 1168; //левовата стойност на юана пляс биткойните
        yuanTo = yuanTo / 1.95; //лева в евра
        yuanTo -= commission / 100 * yuanTo;

        System.out.printf("%.2f", yuanTo);
    }
}
