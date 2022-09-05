package Exam_02;

import java.util.Scanner;

public class MovieRatings_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumMovies = Integer.parseInt(scanner.nextLine()); //брой филми за гледане
        double allRating = 0;
        double bestRating = Double.MIN_VALUE;
        double lowRating = Double.MAX_VALUE;
        String bestMovie = "";
        String lowMovie = "";

        for (int numMovie = 1; numMovie <= sumMovies; numMovie++) { //цикъл върящ според броя на филмите
            String movieName = scanner.nextLine();
            double ratingMovie = Double.parseDouble(scanner.nextLine());
            allRating += ratingMovie;

            //определяне на филма с най-висок и най-нисък рейтинг
            if (ratingMovie > bestRating) {
                bestRating = ratingMovie;
                bestMovie = movieName;
            }else if (ratingMovie < lowRating){
                lowRating = ratingMovie;
                lowMovie = movieName;
            }

        }
        System.out.printf("%s is with highest rating: %.1f%n", bestMovie, bestRating);
        System.out.printf("%s is with lowest rating: %.1f%n", lowMovie, lowRating);
        System.out.printf("Average rating: %.1f", allRating / sumMovies);

    }
}
