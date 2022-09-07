package Exam_03;

import java.util.Scanner;

public class SeriesCalculator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine(); //име на сериала
        int seasonsNum = Integer.parseInt(scanner.nextLine()); //брой сезони
        int episodesNum = Integer.parseInt(scanner.nextLine()); //брой на серийте
        double episodeTime = Double.parseDouble(scanner.nextLine()); //продължителност на един епизод без рекла и

        double episodeWithPause = episodeTime + (20 * 1.0 / 100 * episodeTime); //продължителнст на един епизод с реклами

        double allTimeForWatching =Math.floor(episodesNum * episodeWithPause * seasonsNum + seasonsNum * 10);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", serialName, allTimeForWatching);
    }
}
