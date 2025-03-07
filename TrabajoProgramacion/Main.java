import java.util.*;
import claseTripulacion.*;

public class Main {
public static void main(String[] args) {

    //LUCIA INTERFAZ
    Pantalla panta = new Pantalla();
    panta.setVisible(true);
    panta.setLocationRelativeTo(null); 
    //LUCIA INTERFAZ

    
    ArrayList arr = new ArrayList<ArrayList>();
    Scanner sc= new Scanner(System.in);
        System.out.println("Bienvenido al sistema de gestion de recursos para la defensa (SGRD.V1)");
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        System.out.println("INGRESE EL NUMERO DE ALIENIGENAS ESPERADOS:");

    Int numA=sc.();

    for(int i=0; i<numA;i++){
        añadirTripulantes(sc);
    }
}

public static void comrpobarLetras(String dato){
    try {
        for(int i = 0;i<dato.length();i++){
            if(Character.isDigit(dato.charAt(i))){
                throw new IllegalArgumentException("Error, el texto introducido contiene numeros");
            }
        }
    } catch (IllegalArgumentException e) {
        System.err.println(e.getMessage());
    }
}


public static void añadirTripulantes(Scanner sc){
System.out.println("Son los soldados Robots? s/n");
String op=Lectura.LeerString();
if(op.length()==1){
    if(op.equalsIgnoreCase("s")){

        
    }
}

}

//ESTO VA EN SOLDADOR
public static SoldadoR añadirSoldadoR(){
    Scanner sc= new Scanner(System.in);
    System.out.println("INGRESE EL MODELO DEL ROBOT" + 
                        "\nALPHA, BETA o DELTA");
    String modelo=sc.nextLine();
    if(modelo.equalsIgnoreCase("alpha") || modelo.equalsIgnoreCase("beta") || modelo.equalsIgnoreCase("delta")){
        System.out.println();
    }
}

public static void imprimirFactura(){
    
}

}
