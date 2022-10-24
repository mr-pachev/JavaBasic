package Exersise_03;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String rating = scanner.nextLine();
        int dayToNight = day - 1;
        double onePersonRoom = 18.00;
        double apartment = 25.00;
        double presidentApartment = 35.00;
        double allPrice = 0;
        double discountPrice = 0;

        if (day <= 10) {
            if (typeRoom.equals("apartment")) {
                allPrice = dayToNight * apartment;
                discountPrice = allPrice - (allPrice * 0.3);
                if (rating.equals("positive")) {
                    discountPrice = discountPrice + (discountPrice * 0.25);
                } else if (rating.equals("negative")) {
                    discountPrice = discountPrice - (discountPrice * 0.1);
                }
            } else if (typeRoom.equals("president apartment")) {
                allPrice = dayToNight * presidentApartment;
                discountPrice = allPrice - (allPrice * 0.1);
                if (rating.equals("positive")) {
                    discountPrice = discountPrice + (discountPrice * 0.25);
                } else if (rating.equals("negativ")) {
                    discountPrice = discountPrice - (discountPrice * 0.1);
                }
            }
        } else if (day > 10 && day <= 15) {
            if (typeRoom.equals("apartment")) {
                allPrice = dayToNight * apartment;
                discountPrice = allPrice - (allPrice * 0.35);
                if (rating.equals("positive")) {
                    discountPrice = discountPrice + (discountPrice * 0.25);
                } else if (rating.equals("negativ")) {
                    discountPrice = discountPrice - (discountPrice * 0.1);
                }
            } else if (typeRoom.equals("president apartment")) {
                allPrice = dayToNight * presidentApartment;
                discountPrice = allPrice - (allPrice * 0.15);
                if (rating.equals("positive")) {
                    discountPrice = discountPrice + (discountPrice * 0.25);
                } else if (rating.equals("negative")) {
                    discountPrice = discountPrice - (discountPrice * 0.1);
                }
            }
        } else if (day > 15) {
            if (typeRoom.equals("apartment")) {
                allPrice = dayToNight * apartment;
                discountPrice = allPrice - (allPrice * 0.5);
                if (rating.equals("positive")) {
                    discountPrice = discountPrice + (discountPrice * 0.25);
                } else if (rating.equals("negative")) {
                    discountPrice = discountPrice - (discountPrice * 0.1);
                }
            } else if (typeRoom.equals("president apartment")) {
                allPrice = dayToNight * presidentApartment;
                discountPrice = allPrice - (allPrice * 0.2);
                if (rating.equals("positive")) {
                    discountPrice = discountPrice + (discountPrice * 0.25);
                } else if (rating.equals("negative")) {
                    discountPrice = discountPrice - (discountPrice * 0.1);
                }
            } else if (typeRoom.equals("room for one person")) {
                allPrice = dayToNight * onePersonRoom;
                if (rating.equals("positive")) {
                    discountPrice = allPrice + (allPrice * 0.25);
                } else if (rating.equals("negative")) {
                    discountPrice = allPrice - (allPrice * 0.1);
                }
            }


        }
        System.out.printf("%.2f", discountPrice);

    }
}
