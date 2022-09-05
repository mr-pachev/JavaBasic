package Exam_02;

import java.util.Scanner;

public class CinemaVoucher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine()); //стойност на ваучера
        String voucherName = scanner.nextLine(); //име на ваучера

        int counterTickets = 0; //брояч на закупени билети
        int counterOthers = 0; //брояч на закупени други


        while (!voucherName.equals("End")) {
            int sumExpenses = 0; //общо разходи

            //остойностяване на евентуалната покупка
            if (voucherName.length() > 8) {
                char firstSymbol = voucherName.charAt(0);
                char secondSymbol = voucherName.charAt(1);
                sumExpenses = firstSymbol + secondSymbol;

                //проверка разходите надвишават ли ваучера
                if (sumExpenses <= voucher) {
                    counterTickets++;
                    voucher -= sumExpenses;
                } else {
                    break;
                }
            } else {
                char firstSymbol = voucherName.charAt(0);
                sumExpenses += firstSymbol;

                //проверка разходите надвишават ли ваучера
                if (sumExpenses <= voucher) {
                    counterOthers++;
                    voucher -= sumExpenses;
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
