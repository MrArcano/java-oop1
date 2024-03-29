package org.experis.javaShop;

public class Main {
    public static void main(String[] args) {
        Prodotto prod1 = new Prodotto("Patata","Ortaggio",5.05,10);
        Prodotto prod2 = new Prodotto("Mela","Frutta",10.50,10);
        Prodotto prod3 = new Prodotto("Pizza","Pizza",15.00,10);

        System.out.println(prod1.getPrice());
        System.out.println(prod1.getPriceIva());
        System.out.println(prod1.getCodeName());

        System.out.println(prod2.getPrice());
        System.out.println(prod2.getPriceIva());
        System.out.println(prod2.getCodeName());

        System.out.println(prod3.getPrice());
        System.out.println(prod3.getPriceIva());
        System.out.println(prod3.getCodeName());

    }
}
