package org.example.task5;

import java.util.Scanner;

public class Car implements Drivable {
    private String brand;
    private String model;
    private int releaseYear;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public void start() {
        System.out.println("Your car started moving");
    }

    @Override
    public void stop() {
        System.out.println("The fuel ran out :(");
    }

    @Override
    public void drive(int distance) {
        System.out.println("Brbrbrbrbrbr, your car drove " + distance + " meters");
    }
}
