package claseTripulacion;

public class Soldado extends Tripulacion{
private String codigo;
private int graduacion;
private static int cont=0;
public Soldado(String a, String b, int c){
super(a,b);
graduacion=c;
codigo=generarCodigo();
}

public String generarCodigo() {
        String cod = "";
        String c = cont+"";
        while(c.length()<5){
            c="0"+c;           
            cont++;
        }
        cod+=c;
        return "sol"+cod;    
    }
}