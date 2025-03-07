package claseTripulacion;


public class Minero extends Tripulacion{
private String codigo;
private int edad;
private static int cont=0;
public Minero(String a, String b, int e){
    super(a,b,0);
    codigo=generarCodigo();
    edad=e;
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



}