package claseTripulacion;

public class Soldado extends Tripulacion{
public String codigo;
public int graduacion;
public static int cont=0;
public Soldado(int c){
super();
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