package Lab._04;

import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char sum = text.charAt(i);
            switch (sum) {
                case 'a':
                    count = count + 1;
                    break;
                case 'e':
                    count = count + 2;
                    break;
                case 'i':
                    count = count + 3;
                    break;
                case 'o':
                    count = count + 4;
                    break;
                case 'u':
                    count = count + 5;
                    break;
            }
        }
        System.out.println(count);

    }
}

