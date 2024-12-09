package hu.szamalk;

import java.util.Random;


public class Tabla {

    private char[][] T;
    private char uresCella;

    public Tabla(char uresCella) {
        T = new char[8][8];
        uresCella = uresCella;

        for (int i = 0; i < T.length; i++){
            for (int j = 0; j < T[i].length; j++){
                this.T[i][j] = this.uresCella;
            }
        }

    }

    public String Megjelenit(){
        String tabla = "";
        for (int i = 0; i < T.length; i++){
            for (int j = 0; i < T[i].length; i++){
                tabla += this.T[i][j];

            }tabla += '\n';
        }
        return tabla;
    }

    public void Elhelyez(int N){
        Random random= new Random();

            for (int j = 0; j < N; j++){
                int egy = random.nextInt();
                int ketto = random.nextInt();
                if (T[egy][ketto] != uresCella){
                    this.T[egy][ketto] = 'K';
                }

            }

    }

    public


}
