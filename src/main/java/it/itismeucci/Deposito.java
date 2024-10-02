package it.itismeucci;

public class Deposito extends Thread{

    private Salvadanaio s;
    private int cont;

    public Deposito(Salvadanaio s, int cont){
        this.s = s;
        this.cont = cont;
    }

    public void run(){
        for(int i = 0; i<cont; i++){
            s.aggiungiMoneta();
        }
    }
}
