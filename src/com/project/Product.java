package com.project;

public class Product {
    private int price;
    private String name;
    private Manufacturer manufacturer;
    private static int total = 0;
    private static int productNumber = 0;

    public Product() {  }

    public Product(String name, int price, Manufacturer manufacturer) {
        this.price = price;
        total += price;
        this.name = name;
        this.manufacturer = manufacturer;
        productNumber++;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        total = total - this.price + price;
        this.price = price;
    }

    public static int getProductNumber() {
        return productNumber;
    }

    public static int getAverage() {
        return total/productNumber;
    }

    public static int getTotal() {
        return total;
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
