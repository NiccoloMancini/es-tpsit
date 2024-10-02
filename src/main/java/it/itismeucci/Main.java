package it.itismeucci;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Salvadanaio s = new Salvadanaio(0);
        Deposito d1 = new Deposito(s, 1000);
        Deposito d2 = new Deposito(s, 1000);
        d1.start();
        d2.start();
        d1.join();
        d2.join();
        System.out.println(s.getCont());
    }
}