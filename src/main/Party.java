package main;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        Party2 party2 = new Party2();

        while (shouldContinue) {
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyswietl goscia");
            System.out.println("2.Dodaj goscia");
            System.out.println("3. Wyswietl potrawy");
            System.out.println("4.Znajdz po numerze telefonu");
            System.out.println("5. Wyjscie");

            int userChoice = scanner.nextInt();

            
            switch (userChoice) {
                case 1 :
                   party2.displayGuests();
                    break;
                case 2 :
                   party2.addGuest();
                    break;
                case 3 :
                    party2.displayMeals();
                    break;
                case 4 :
                    break;
                case 5 :
                    shouldContinue = false;
            }
        }
    }
}
