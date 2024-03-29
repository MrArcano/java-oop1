package org.experis.javaShop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String description;
    private double price;
    private int iva;

    public Prodotto(String name, String description, double price, int iva) {

        Random rand = new Random();
        this.code = rand.nextInt(99999999) + 1;

        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public double getPrice() {
        return this.price;
    }

    public double getPriceIva() {
        return Math.floor(this.price * (1 + ((double) this.iva / 100)) * 100) / 100;
    }

    public String getCodeName() {
        return String.format("%08d", this.code) + '-' + this.name;
    }

}
