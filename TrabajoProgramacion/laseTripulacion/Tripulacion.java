package claseTripulacion;

import java.util.Random;


public abstract class Tripulacion {

    public String nombre;
    public String genero;
    public int fuerza;

    public Tripulacion(String a, String b){
        nombre=a;
        genero=b;
        fuerza=generarNumeroRandom();
    }
    public Tripulacion(){
        nombre=Nombres.darNombre();
        genero=Nombres.getGenero();
        fuerza=generarNumeroRandom();

    }
    public Tripulacion(int a) {
        nombre = Nombres.darNombre();
        genero = Nombres.getGenero();
        fuerza = a;
    }
    public Tripulacion(String a, String b, int d){
        nombre=a;
        genero=b;
        fuerza=d;
    }
    public static int generarNumeroRandom() {
        Random random = new Random();
        return random.nextInt(9) + 1;  // Números entre 1 y 9
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getFuerza() {
        return fuerza;
    }
}