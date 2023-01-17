package com.project;

public class Product {
    private int price;
    private String name;
    private Manufacturer manufacturer;

    public Product() {  }

    public Product(String name, int price, Manufacturer manufacturer) {
        this.price = price;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String toString() {
        return String.format("Product name: %s\nProduct price: %d\n; Product manufacturer: %s", name, price,manufacturer.getName());
    }
}
