package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        Conto conto = new Conto(nome);
        System.out.println("Conto creato con successo!");
        System.out.println(conto.getInformazioniConto());

        boolean esci = false;
        while (!esci) {
            System.out.println("Seleziona un'opzione:");
            System.out.println("1. Versa una somma di denaro");
            System.out.println("2. Preleva una somma di denaro");
            System.out.println("3. Esci");

            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1 -> {
                    System.out.print("Inserisci l'importo da versare: ");
                    double importoVersamento = scanner.nextDouble();
                    conto.versamento(importoVersamento);
                    System.out.println("Versamento effettuato con successo.");
                    System.out.println("Saldo attuale: " + conto.getSaldoFormattato());
                }
                case 2 -> {
                    System.out.print("Inserisci l'importo da prelevare: ");
                    double importoPrelievo = scanner.nextDouble();
                    boolean prelievoSuccesso = conto.prelievo(importoPrelievo);
                    if (prelievoSuccesso) {
                        System.out.println("Prelievo effettuato con successo.");
                        System.out.println("Saldo attuale: " + conto.getSaldoFormattato());
                    } else {
                        System.out.println("Prelievo non valido. Assicurati di avere un saldo sufficiente e di inserire un importo positivo.");
                    }
                }
                case 3 -> esci = true;
                default -> System.out.println("Scelta non valida. Riprova.");
            }
        }

        System.out.println("Grazie per aver utilizzato il nostro servizio bancario. Arrivederci!");
    }
}
