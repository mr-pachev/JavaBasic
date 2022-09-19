package Exam_05;

import java.util.Scanner;

public class Skeleton_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int control = Integer.parseInt(scanner.nextLine()); //времето, което трябва да се достигне или подобри в минути
        int controlSec = Integer.parseInt(scanner.nextLine()); //някаква контрола в секунди
        double cuteLenght = Double.parseDouble(scanner.nextLine()); //дължина на улея
        int timeCrossHundredMeters = Integer.parseInt(scanner.nextLine()); //времето за изминаване на сто метра

        double slowly = cuteLenght / 120; //колко пъти ще има забавяне с 2,5 секунди
        slowly = slowly * 2.5;

        control =  control * 60 + controlSec;

        double allCrossTime = timeCrossHundredMeters * (cuteLenght / 100) - slowly; //времето на Марин

        if (allCrossTime <= control) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", allCrossTime);
        }else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", allCrossTime - control);
        }


    }
}
