package Exam_03;

import java.util.Scanner;

public class FavoriteMovie_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String movieName = ""; //име на филм
        int counterMovie = 0/брояч на филмите
        int bestMoviePoints = 0; //филма с най-много точки до момента
        String bestMovieName = "";

        while (!input.equals("STOP") || counterMovie <= 7) {
            movieName = input;
            counterMovie++;

            if (counterMovie <= 7) { //проверка броя на филмите да не надвишава 7
                int currentPointsCounter = 0; //брояч на точките за текущия филм

                for (int indexMovieName = 0; indexMovieName < movieName.length(); indexMovieName++) { //цикъл за обхождане на всяка буква от името на филма
                    char currentIndex = movieName.charAt(indexMovieName); //текуща буква от името на филма

                    if (currentIndex >= 97 && currentIndex <= 122) { //малка буква
                        currentPointsCounter += currentIndex - (2 * movieName.length());
                    } else if (currentIndex >= 65 && currentIndex <= 90) { //голяма буква
                        currentPointsCounter += currentIndex - movieName.length();
                    } else { //всеки друг символ
                        currentPointsCounter += currentIndex;
                    }

                }

                if (currentPointsCounter >= bestMoviePoints) { //проверка за най-добър филмо по точки
                    bestMoviePoints = currentPointsCounter;
                    bestMovieName = movieName;
                }

                input = scanner.nextLine();

            } else {
                System.out.println("The limit is reached.");
                break;
            }

        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovieName, bestMoviePoints);

    }
}
