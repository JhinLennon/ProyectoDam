package claseTripulacion;


import java.util.Random;

public class Minero extends Tripulacion{
private String codigo;
private int edad;
private static int cont=0;
public Minero(){
    super(0);
    codigo=generarCodigo();
    edad=generarNumeroRandom();
    }

public String generarCodigo() {
        String cod = "";
        String c = cont+"";
        while(c.length()<5){
            c="0"+c;           
            cont++;
        }
        cod+=c;
        return "min"+cod;    
    }

    public static int generarNumeroRandom() {
        Random random = new Random();
        return random.nextInt(50) + 18;  // Números entre 1 y 9
    }



}