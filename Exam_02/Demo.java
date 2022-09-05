package Exam_02;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        String incoming = scanner.nextLine();
        int counterTickets = 0;
        int counterOthers = 0;
        int priceTickets = 0;
        int priceOthers = 0;

        while (!incoming.equals("End") && (priceTickets <= voucher || priceOthers <= voucher)) {

            String firstSymbol = incoming.split("")[0]; //отделяме само първата буква, като стринг
            char firstSymbolChar = firstSymbol.charAt(0); //превръщаме стринга в чар
            int firstSymbolInteger = (int) firstSymbolChar; //стойност на буквата според ASCII

            String secondSymbol = incoming.split("")[1];
            char secondSymbolChar = secondSymbol.charAt(0);
            int secondSymbolInteger = (int) secondSymbolChar;

            //остойностяване на текущата покупка
            if (incoming.length() > 8) {
                priceTickets = firstSymbolInteger + secondSymbolInteger;
                counterTickets++;
                voucher -= priceTickets;
            } else {
                priceOthers = firstSymbolInteger;
                counterOthers++;
                voucher -= priceOthers;
            }

            incoming = scanner.nextLine();
        }

        System.out.println(counterTickets);
        System.out.println(counterOthers);
    }
}

