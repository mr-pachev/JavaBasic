package Exersise_03;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numOvernidht = Integer.parseInt(scanner.nextLine());
        double studioNidht = 0;
        double apartmentNight = 0;
        double allStudioNight = 0;
        double allApartmentNight = 0;
        double discountStudio = 0;
        double discountApartment = 0;

        if (month.equals("May") || month.equals("October")) {
            if (numOvernidht >= 1 && numOvernidht <= 7) {
                studioNidht = 50;
                apartmentNight = 65;
                allStudioNight = numOvernidht * studioNidht;
                allApartmentNight = numOvernidht * apartmentNight;
            }else if (numOvernidht > 7 && numOvernidht <= 14) {
                studioNidht = 50;
                apartmentNight = 65;
                allStudioNight = numOvernidht * studioNidht;
                allApartmentNight = numOvernidht * apartmentNight;
                discountStudio = allStudioNight - (allStudioNight * 0.05);
                allStudioNight = discountStudio;
            } else if (numOvernidht > 14) {
                studioNidht = 50;
                apartmentNight = 65;
                allStudioNight = numOvernidht * studioNidht;
                allApartmentNight = numOvernidht * apartmentNight;
                discountApartment = allApartmentNight - (allApartmentNight * 0.1);
                discountStudio = allStudioNight - (allStudioNight * 0.3);
                allStudioNight = discountStudio;
                allApartmentNight = discountApartment;
            }
        } else if (month.equals("June") || month.equals("September")) {
            if (numOvernidht > 14) {
                studioNidht = 75.20;
                apartmentNight = 68.70;
                allStudioNight = numOvernidht * studioNidht;
                allApartmentNight = numOvernidht * apartmentNight;
                discountStudio = allStudioNight - (allStudioNight * 0.2);
                discountApartment = allApartmentNight - (allApartmentNight * 0.1);
                allStudioNight = discountStudio;
                allApartmentNight = discountApartment;
            } else if (numOvernidht <= 14) {
                studioNidht = 75.20;
                apartmentNight = 68.70;
                allStudioNight = numOvernidht * studioNidht;
                allApartmentNight = numOvernidht * apartmentNight;
            }
        } else if (month.equals("July") || month.equals("August")) {
            if (numOvernidht > 14) {
                studioNidht = 76;
                apartmentNight = 77;
                allStudioNight = numOvernidht * studioNidht;
                allApartmentNight = numOvernidht * apartmentNight;
                discountApartment = allApartmentNight - (allApartmentNight * 0.1);
                allApartmentNight = discountApartment;
            } else if (numOvernidht <= 14) {
                studioNidht = 76;
                apartmentNight = 77;
                allStudioNight = numOvernidht * studioNidht;
                allApartmentNight = numOvernidht * apartmentNight;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", allApartmentNight);
        System.out.printf("Studio: %.2f lv.", allStudioNight);

    }
}
