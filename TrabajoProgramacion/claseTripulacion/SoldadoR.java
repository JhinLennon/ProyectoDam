package claseTripulacion;

public class SoldadoR extends Tripulacion{
private String codigo;
private int graduacion;
private double version;
private static int cont = 0;
//Para lo que es el nombre, en Robot funcionará como modelo, es decir alpha o beta, seguido de su version
public SoldadoR(String a, String b, int c, double v){
super(a+" v"+v,b,9);
graduacion=c;
codigo=generarCodigo();
version=v;

}

public String generarCodigo() {
        String cod = "";
        String c = cont+"";
        while(c.length()<5){
            c="0"+c;           
            cont++;
        }
        cod+=c;
        return "solR"+cod;    
    }
}