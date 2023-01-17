package com.project;

public class Manufacturer {
    private String name;

    public Manufacturer() {}

    public Manufacturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Manufacturer name: %s", name);
    }
}
