package hu.szamalk;

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
            for (int j = 0; i < T.length; i++){
                tabla += this.T[i][j];

            }tabla += "\n";
        }
        return tabla;
    }


}
