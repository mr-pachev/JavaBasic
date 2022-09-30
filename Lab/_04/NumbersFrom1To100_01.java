package Lab._04;

import java.util.Scanner;

public class NumbersFrom1To100_01 {
    public static void main(String[] args) {

        for (int i = 1;i <= 100; i ++){
            System.out.println(i);
        }
    }

    public static class CharacterSequence_05 {
        public class CharacterSequence {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                String text = scanner.nextLine();
                for (int i = 0; i < text.length(); i++) {
                    System.out.println(text.charAt(i));
                }

            }
        }
    }
}
