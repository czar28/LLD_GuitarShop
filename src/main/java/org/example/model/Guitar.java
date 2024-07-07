package org.example.model;

public class Guitar {

    private int price;
    private String modelNumber;
    private GuitarSpecs guitarSpecs;

    public Guitar(int price, String modelNumber, GuitarSpecs guitarSpecs) {
        this.price = price;
        this.modelNumber = modelNumber;
        this.guitarSpecs = guitarSpecs;
    }

    public GuitarSpecs getGuitarSpecs() {
        return guitarSpecs;
    }

    public int getPrice() {
        return price;
    }

    public String getModelNumber() {
        return modelNumber;
    }
}
