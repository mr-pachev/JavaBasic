package Exersise_03;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishman = Integer.parseInt(scanner.nextLine());
        double priceRent = 0;

        switch (season) {
            case "Spring":
                priceRent = 3000;
                break;
            case "Summer":
            case "Autumn":
                priceRent = 4200;
                break;
            case "Winter":
                priceRent = 2600;
                break;
            default:
                break;
        }
        if (fishman <= 6) {
            priceRent = priceRent - (priceRent * 0.1);
        } else if (fishman > 7 && fishman <= 11) {
            priceRent = priceRent - (priceRent * 0.15);
        } else if (fishman > 12) {
            priceRent = priceRent - (priceRent * 0.25);
        }
        if (fishman % 2 == 0 && !(season.equals("Autumn"))) {
            priceRent = priceRent - (priceRent * 0.05);
        }
        double diff = Math.abs(budget - priceRent);

        if (budget >= priceRent) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
//            if (fishman % 2 == 0) {
//                if (fishman <= 6) {
//                    if (season.equals("Spring")) {
//                        priceRent = 3000 - (3000 * 0.1) - (3000 * 0.05);
//                    } else if (season.equals("Summer")) {
//                        priceRent = 4200 - (4200 * 0.1) - (4200 * 0.05);
//                    } else if (season.equals("Autumn")) {
//                        priceRent = 4200 - (4200 * 0.1);
//                    } else if (season.equals("Winter")) {
//                        priceRent = 2600 - (2600 * 0.1) - (2600 * 0.05);
//                    }
//
//                } else if (fishman > 7 && fishman <= 11) {
//                    if (season.equals("Spring")) {
//                        priceRent = 3000 - (3000 * 0.15) - (3000 * 0.05);
//                    } else if (season.equals("Summer")) {
//                        priceRent = 4200 - (4200 * 0.15) - (4200 * 0.05);
//                    } else if (season.equals("Autumn")) {
//                        priceRent = 4200 - (4200 * 0.15);
//                    } else if (season.equals("Winter")) {
//                        priceRent = 2600 - (2600 * 0.15) - (2600 * 0.05);
//                    }
//
//                } else if (fishman > 12) {
//                    if (season.equals("Spring")) {
//                        priceRent = 3000 - (3000 * 0.25) - (3000 * 0.05);
//                    } else if (season.equals("Summer")) {
//                        priceRent = 4200 - (4200 * 0.25) - (4200 * 0.05);
//                    } else if (season.equals("Autumn")) {
//                        priceRent = 4200 - (4200 * 0.25);
//                    } else if (season.equals("Winter")) {
//                        priceRent = 4200 - (4200 * 0.25) - (4200 * 0.05);
//                    }
//                }
//
//            } else if (fishman <= 6) {
//                if (season.equals("Spring")) {
//                    priceRent = 3000 - (3000 * 0.1);
//                } else if (season.equals("Summer")) {
//                    priceRent = 4200 - (4200 * 0.1);
//                } else if (season.equals("Autumn")) {
//                    priceRent = 4200 - (4200 * 0.1);
//                } else if (season.equals("Winter")) {
//                    priceRent = 2600 - (2600 * 0.1);
//                }
//
//            } else if (fishman > 7 && fishman <= 11) {
//                if (season.equals("Spring")) {
//                    priceRent = 3000 - (3000 * 0.15);
//                } else if (season.equals("Summer")) {
//                    priceRent = 4200 - (4200 * 0.15);
//                } else if (season.equals("Autumn")) {
//                    priceRent = 4200 - (4200 * 0.15);
//                } else if (season.equals("Winter")) {
//                    priceRent = 2600 - (2600 * 0.15);
//                }
//
//            } else if (fishman > 12) {
//                if (season.equals("Spring")) {
//                    priceRent = 3000 - (3000 * 0.25);
//                } else if (season.equals("Summer")) {
//                    priceRent = 4200 - (4200 * 0.25);
//                } else if (season.equals("Autumn")) {
//                    priceRent = 4200 - (4200 * 0.25);
//                } else if (season.equals("Winter")) {
//                    priceRent = 2600 - (2600 * 0.25);
//                }
//            }
//            double diff = Math.abs(budget - priceRent);
//
//            if (budget >= priceRent) {
//                System.out.printf("Yes! You have %.2f leva left.", diff);
//            } else if (budget < priceRent) {
//                System.out.printf("Not enough money! You need %.2f leva.", diff);
//            }


    }
}
