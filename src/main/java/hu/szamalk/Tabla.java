package hu.szamalk;

import java.util.Random;


public class Tabla {

    private char[][] T;
    private char uresCella;

    public Tabla(char urescella) {
        T = new char[8][8];
        uresCella = urescella;

        for (int i = 0; i < T.length; i++){
            for (int j = 0; j < T[i].length; j++){
                this.T[i][j] = this.uresCella;
            }
        }

    }

    public String Megjelenit(){
        String tabla = "";
        for (int i = 0; i < T.length; i++){
            for (int j = 0; j < T[i].length; j++){
                tabla += this.T[i][j];

            }tabla += '\n';
        }
        return tabla;
    }

    public void Elhelyez(int N){
        Random random= new Random();

            for (int i = 0; i < N; i++){
                int egy = random.nextInt(8);
                int ketto = random.nextInt(8);
                if (T[egy][ketto] != uresCella){
                    T[egy][ketto] = 'K';
                }

            }

    }


    /*public boolean UresOszlop(int oszlop){


    }*/


    public boolean UresOszlop(int oszlop){
        boolean szam = 0.0;
        for (int i =0; i < T.length; i++){


        }return szam;

    }
    public boolean UresSor(int sor){
        int szam = 0;
        for (int i =0; i < T[sor].length; i++){


        }return szam;
    }



}
