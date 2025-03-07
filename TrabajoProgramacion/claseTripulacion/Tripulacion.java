package claseTripulacion;

import java.util.Random;


public abstract class Tripulacion {

    private String nombre;
    private String genero;
    private int fuerza;

    public Tripulacion(String a, String b){
        nombre=a;
        genero=b;
        fuerza=generarNumeroRandom();
    }//yoooo voy a apagar yaa bale uwuuuuu
    public tr
    public Tripulacion(String a, String b, int d){
        nombre=a;
        genero=b;
        fuerza=d;
    }
    public static int generarNumeroRandom() {
        Random random = new Random();
        return random.nextInt(9) + 1;  // Números entre 1 y 9
    }
}