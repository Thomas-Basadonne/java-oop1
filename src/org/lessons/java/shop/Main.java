package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("Pizza Margherita", "Descrizione Pizza Margherita", 10.0, 0.22);
        System.out.println("Codice prodotto: " + prodotto.getCodice());
        System.out.println("Nome prodotto: " + prodotto.getNome());
        System.out.println("Descrizione prodotto: " + prodotto.getDescrizione());
        System.out.println("Prezzo base: " + prodotto.getPrezzo());
        System.out.println("Prezzo ivato: " + prodotto.getPrezzoIvato());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());

        prodotto.setNome("Pizza Margherita 2");
        prodotto.setDescrizione("Descrizione Pizza Margherita 2");
        prodotto.setPrezzo(15.0);
        prodotto.setIva(0.22);

        System.out.println("Nome prodotto aggiornato: " + prodotto.getNome());
        System.out.println("Descrizione prodotto aggiornata: " + prodotto.getDescrizione());
        System.out.println("Prezzo base aggiornato: " + prodotto.getPrezzo());
        System.out.println("Prezzo ivato aggiornato: " + prodotto.getPrezzoIvato());
        System.out.println("Nome esteso aggiornato: " + prodotto.getNomeEsteso());
    }
}
