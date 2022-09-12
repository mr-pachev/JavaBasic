package Exam_03;

import java.util.Scanner;

public class FavoriteMovie_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String movieName = ""; //име на филм

        int counterMovie =0; //брояч на филмите
        int bestMoviePoints = 0; //филма с най-много точки до момента
        String bestMovieName = "";

        while (!input.equals("STOP")){
            int currentPointsCounter = 0; //брояч на точките за текущия филм
            movieName = input;
            counterMovie++;

            if(counterMovie <= 7){

                for (int indexMovieName = 0; indexMovieName < movieName.length(); indexMovieName++) {
                    char currentIndex = movieName.charAt(indexMovieName); //текуща буква от името на филма

                    // проверка дали буквата е малка или голяма
                    if(currentIndex >= 97 && currentIndex <= 122){ //малка буква
                        currentPointsCounter += currentIndex - (2 * movieName.length());
                    }else if ( currentIndex >= 65 && currentIndex <= 90){ //голяма буква
                        currentPointsCounter += currentIndex - movieName.length();
                    }else {
                        currentPointsCounter += currentIndex;
                    }

                }

                if (currentPointsCounter >= bestMoviePoints){
                    bestMoviePoints = currentPointsCounter;
                    bestMovieName = movieName;
                }

            }else {
                System.out.println("The limit is reached.");
                break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovieName, bestMoviePoints);

    }
}
