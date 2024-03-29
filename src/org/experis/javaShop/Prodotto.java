package org.experis.javaShop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private int iva;

    public Prodotto(String name, String description, double price, int iva) {

        Random rand = new Random();
        this.code = rand.nextInt(99999999) + 1;

        this.name = name;
        this.description = description;
        this.price = BigDecimal.valueOf(price);
        this.iva = iva;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public BigDecimal getPriceIva() {
        // return Math.floor(this.price * (1 + ( this.iva / 100)) * 100) / 100;
        return (this.price.multiply(BigDecimal.valueOf(1 + ((double) this.iva / 100)))).setScale(2, RoundingMode.HALF_UP);
    }

    public String getCodeName() {
        return String.format("%08d", this.code) + '-' + this.name;
    }
}
