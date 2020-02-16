package car.com;

import java.util.Scanner;

public class CarModel implements VehicleModel  {

    float carPrice = 0.0f;
    int carMillage = 0;
   // int millage = 0;
    String[] carType = {"Toyota", "Honda"};
    Scanner sc = new Scanner(System.in);


    @Override
    public void drive() {
        System.out.println("Please enter car price ");
        carPrice = sc.nextInt();
        System.out.println("Please select car millage between 25 to 35");
        carMillage = sc.nextInt();

        if (carMillage >=30 && carMillage<=35 && carPrice >= 3500) {
            System.out.println(" The suggested car to purchase is " + carType[0]);
            carBrakes(carType[0]);
        } else if ((carMillage < 35) && (carPrice < 3500)) {
            System.out.println("The suggested car to purchase is " + carType[1]);
            carBrakes(carType[1]);
        } else {
            System.out.println("Sorry, We do not have car you are looking for and will call you once it is available");
        }

    }

    public void carBrakes(String carType) {
        String tbrake = "TBrake";
        String hbrake = "HBrake";

        if (carType.equals("Toyota")) {
            System.out.println("The brake type is " + tbrake);
        } else {
            System.out.println("The brake type is " + hbrake);
        }
    }

    public void carCooling() {
        if (carType.equals("Toyota")) {
            System.out.println(" We are getting 5 star colling system in the car");
        } else {
            System.out.println(" We are getting average colling system in the car");
        }

    }

    public void carHeating() {

        if (carType.equals("Toyota")) {
            System.out.println(" We are getting 5 star Heating  system in the car");
        } else {
            System.out.println(" We are getting average Heating system in the car");
        }
    }

    public void size() {
        int passenger = 0;
        System.out.println("Please enter the number of passenger: ");
        passenger = sc.nextInt();
        if (passenger == 6) {
            System.out.println(" You should  buy a  SUV model");
        } else if (passenger == 4) {
            System.out.println(" You should buy a sedan  model");
        } else if (passenger > 6) {
            System.out.println("You should purchase a Truck ");
        } else {
            System.out.println(" You should purchase a car that suitable for you");
        }
    }

    public void type() {
        if (carPrice > 50000) {
            System.out.println(" The store is suggesting to purchase electric car to the customer");
        } else {
            System.out.println(" You have selected a right car");
        }
    }

   // @Override
    public void oilChange() {

        System.out.println("Provide the current car millage");
        int currentCarMillage = sc.nextInt();
        if (currentCarMillage > 3000) {
            System.out.println(" Car is ready for next oil change");
        } else {
            System.out.println("The car is not ready for oil change yet");
        }

    }

    //@Override
    public void brakeRepair() {
        System.out.println("Each car need break service after certain period");
    }

    //@Override
    public void tireService() {
        System.out.println("Each car need tire service after certain time");
    }
}