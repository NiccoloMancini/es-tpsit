package it.itismeucci;

public class Salvadanaio {
    private int cont;

    public Salvadanaio(int i){
        cont = i;
    }

    public int getCont() {
        return cont;
    }

    synchronized public void aggiungiMoneta(){
        cont++;
    }
    
}
