package org.lessons.java.bank;

import java.util.Random;


public class Conto {
    private final int numeroConto;
    private final String proprietario;
    private double saldo;

    public Conto(String proprietario) {
        this.numeroConto = generateRandomAccountNumber();
        this.proprietario = proprietario;
        this.saldo = 0;
    }



    public void versamento(double importo) {
        saldo += importo;
    }

    public boolean prelievo(double importo) {
        if (importo > saldo || importo <= 0) {
            return false; // Saldo insufficiente o importo non valido per il prelievo
        }

        saldo -= importo;
        return true;
    }

    public String getInformazioniConto() {
        return "Numero Conto: " + numeroConto + "\nProprietario: " + proprietario + "\nSaldo: " + getSaldoFormattato();
    }

    public String getSaldoFormattato() {
        return String.format("%.2f€", saldo);
    }

    private int generateRandomAccountNumber() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }
}
