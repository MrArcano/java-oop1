package org.experis.javaBank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        Conto account = new Conto(scan.nextLine());

        System.out.println(account.getName());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        
        boolean iterate = true;
        while (iterate){
            System.out.println("Premi 1 per versare soldi");
            System.out.println("Premi 2 per prelevare soldi");
            System.out.println("Premi 3 per uscire");
            System.out.print("Scelta: ");
            
            int choice = Integer.parseInt(scan.nextLine());
            double money;
            
            switch (choice){
                case 1:
                    System.out.println("Quanto vuoi versere ?");
                    money = Double.parseDouble(scan.nextLine());
                    account.deposit(money);
                    break;

                case 2:
                    System.out.println("Quanto vuoi prelevare ?");
                    money = Double.parseDouble(scan.nextLine());

                    System.out.println(account.withdraw(money) ? "Prelievo effettuato!" : "Prelievo non possibile!");
                    System.out.println("Bilancio: " + account.getBalance());
                    break;

                default:
                    iterate = false;
                    break;
            }
        }

    }
}
