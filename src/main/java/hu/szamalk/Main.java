package hu.szamalk;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Tabla tabla = new Tabla('#');

        System.out.println(tabla.Megjelenit());
        tabla.Elhelyez(8);
        tabla.UresSor();
        tabla.UresOszlop();


    }
}