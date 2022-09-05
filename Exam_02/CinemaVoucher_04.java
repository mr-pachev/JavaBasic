package Exam_02;

import java.util.Scanner;

public class CinemaVoucher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine()); //стойност на ваучера
        String voucherName = scanner.nextLine(); //име на ваучера

        int counterTickets = 0; //брояч на закупени билети
        int counterOthers = 0; //брояч на закупени други
        int sumExpensesTickets = 0; //общо разходи за билети
        int sumExpensesOthers = 0; //общо разходи за други

        while (!voucherName.equals("End")) {

            //остойностяване на евентуалната покупка
            if (voucherName.length() > 8) {
                char firstSymbol = voucherName.charAt(0);
                char secondSymbol = voucherName.charAt(1);
                sumExpensesTickets += (firstSymbol + secondSymbol);

                //проверка разходите надвишават ли ваучера
                if (sumExpensesTickets < voucher) {
                    counterTickets++;
                    voucher -= sumExpensesTickets;
                } else {
                    break;
                }
            } else {
                char firstSymbol = voucherName.charAt(0);
                sumExpensesOthers += firstSymbol;

                //проверка разходите надвишават ли ваучера
                if (sumExpensesOthers < voucher) {
                    counterOthers++;
                    voucher -= sumExpensesOthers;
                } else {
                    break;
                }
            }

            voucherName = scanner.nextLine();
        }
        System.out.println(counterTickets);
        System.out.println(counterOthers);
    }
}
