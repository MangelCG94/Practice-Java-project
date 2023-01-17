package com.project;

public class Main {
    public static void main(String[] args) {
        Manufacturer apple = new Manufacturer("Apple");
        Product ordenador = new Product("mac",500,apple);
        System.out.println(ordenador.toString());
    }
}