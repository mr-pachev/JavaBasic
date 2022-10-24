package Exersise_03;

import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examTimeInMin = (hourExam * 60) + minExam;
        int arriveTimeInMin = (arrivalHour * 60) + arrivalMin;
        int diff = Math.abs(examTimeInMin - arriveTimeInMin);

//        ако студентът пристига точно в часа на изпита или до 30 минути по-рано
        if (arriveTimeInMin < examTimeInMin && diff <= 30) {
            System.out.println("On time");
//            за идване по-рано с по-малко от час
            System.out.printf("%d minutes before the start", (diff % 60));
        } else if (arriveTimeInMin == examTimeInMin) {
            System.out.println("On time");
//            ако студентът пристига повече от 30 минути преди часа на изпита
        } else if (arriveTimeInMin < examTimeInMin && diff > 30 && diff < 60) {
            System.out.println("Early");
//            за идване по-рано с по-малко от час
            System.out.printf("%d minutes before the start", (diff % 60));
//            ако студентът пристига повече от 30 минути преди часа на изпита
        } else if (arriveTimeInMin < examTimeInMin && diff >= 60) {
            System.out.println("Early");
//            за подраняване с 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:05
            System.out.printf("%d:%02d hours before the start", (diff / 60), (diff % 60));
//            ако студентът пристига по-късно от часа на изпита
        } else if (arriveTimeInMin > examTimeInMin && diff < 60) {
            System.out.println("Late");
//            за закъснение под час
            System.out.printf("%d minutes after the start", (diff % 60));
        } else if (arriveTimeInMin > examTimeInMin && diff >= 60) {
            System.out.println("Late");
//            за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:03
            System.out.printf("%d:%02d hours after the start", (diff / 60), (diff % 60));
        }

    }
}
