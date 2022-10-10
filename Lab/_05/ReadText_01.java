package Lab._05;

import java.util.Scanner;

public class ReadText_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("Stop")) {
            String currentWord = scanner.nextLine();
            System.out.println(word);
            word = currentWord;
        }
    }
}
