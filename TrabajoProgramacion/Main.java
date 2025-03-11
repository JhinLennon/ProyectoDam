import java.util.*;
import claseTripulacion.*;

public class Main {
        static Scanner sc= new Scanner(System.in);

        static HashMap<String, Soldado> mapaSoldados = new HashMap<>();
        static HashMap<String, Minero> mapaMineros = new HashMap<>();
        static HashMap<String, Vehiculo> mapaVehiculos = new HashMap<>();
        static HashMap<String, Aliens> mapaAlienigenas = new HashMap<>();
public static void main(String[] args) {

    //LUCIA INTERFAZ
    Pantalla panta = new Pantalla();
    panta.setVisible(true);
    panta.setLocationRelativeTo(null); 
    //LUCIA INTERFAZ


    
    ArrayList arr = new ArrayList<ArrayList>();

        System.out.println("Bienvenido al sistema de gestion de recursos para la defensa (SGRD.V1)");
        System.out.println("----------------------------------------------------------------------");
        System.out.println();

        // 1. Número esperado de alienígenas
        System.out.print("Ingrese el número esperado de alienígenas: ");
        static int numAlienigenas = Lectura.LeerEntero();
        sc.nextLine(); // Limpiar el buffer

        // 2. Distancia en años luz de la nave DKW-RR.3
        System.out.print("Ingrese la distancia en años luz a la nave DKW-RR.3: ");
        double distanciaAniosLuz = Lectura.LeerDoble();
        sc.nextLine(); // Limpiar el buffer


        System.out.println("\nListado de soldados:");
        for (var entry : mapaSoldados.entrySet()) {
            System.out.println("- Código: " + entry.getKey() + ", Nombre: " + entry.getValue().getNombre());
        }

                System.out.println("\nListado de mineros:");
        for (var entry : mapaMineros.entrySet()) {
            System.out.println("- Código: " + entry.getKey() + ", Nombre: " + entry.getValue().getNombre());
        }

        double costeMineros = mapaMineros.size() * 20 * 3;
        double costeSoldados = mapaSoldados.size() * 22 * 3;
        double penalizacionAlienigenas = mapaAlienigenas.size() * 4 * 3;
        double costeTotal = costeMineros + costeSoldados + penalizacionAlienigenas;
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

public static void añadirSoldadoHashMap(){
        System.out.println("\nCreación de soldados:");
        for (int i = 1; i <= numAlienigenas * 2; i++) {
            System.out.println("Soldado #" + i);
            System.out.print("Nombre: ");
            String nombre = Lectura.LeerString();
            System.out.print("Sexo (Masculino/Femenino): ");
            String sexo = Lectura.LeerString();
            System.out.print("Graduación (entero): ");
            int graduacion = Lectura.LeerEntero();
            sc.nextLine();

            Soldado soldado = new Soldado(nombre, sexo, graduacion);
            mapaSoldados.put("sold" + i, soldado);
    }
}

public static void añadirMineroHashMap(){
        System.out.println("\nCreación de mineros:");
        for (int i = 1; i <= numAlienigenas * 2; i++) {
            System.out.println("Minero #" + i);
            System.out.print("Nombre: ");
            String nombre = Lectura.LeerString();
            System.out.print("Sexo (Masculino/Femenino): ");
            String sexo = Lectura.LeerString();
            System.out.print("Edad (entero): ");
            int edad = Lectura.LeerEntero();
            sc.nextLine();

            Minero minero = new Minero(nombre, sexo, edad);
            mapaMineros.put("min" + i, minero);
    }
}

public static void imprimirFactura(){
    
}

}
