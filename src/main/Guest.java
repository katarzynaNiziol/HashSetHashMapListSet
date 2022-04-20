package main;

public class Guest {
    private String name;
    private String meals;
    private int phoneNumber;
    private boolean isVegan;

    public Guest(String name, String meals, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meals = meals;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMeals() {
        return meals;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }
    public void displayGuestInformation(){
        System.out.println("Imie: " + name);
        System.out.println("Preferowany posilek: " + meals);
        System.out.println("Numer telefonu " + phoneNumber);
        String isVeganString = isVegan ? "tak" : "nie";
        System.out.println("Weganin" + isVegan);
    }
}
