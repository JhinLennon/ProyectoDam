import java.util.*;

public class Lectura{

    public static int LeerEntero(){
        Scanner sc = new Scanner(System.in);
        boolean leido = false;
        int dato = 0;
        while(!leido){
            try {
                dato=sc.nextInt();
                leido=true;
            } catch (Exception e) {
                System.err.println("Dato erroneo");
                sc.nextLine();
            }
        }
        return dato;
    }
    
    public static double LeerDoble(){
        Scanner sc = new Scanner(System.in);
        boolean leido = false;
        double dato = 0;
        while(!leido){
            try {
                dato=sc.nextDouble();
                leido=true;
            } catch (Exception e) {
                System.err.println("Dato erroneo");
                sc.nextLine();
            }
        }
        return dato;
    }
    public static String LeerString() {
        Scanner sc = new Scanner(System.in);
        boolean leido = false;
        String dato = "";
        
        while (!leido) {
            try {
                dato = sc.nextLine();
                leido = true;
            } catch (Exception e) {
                System.err.println("Error al leer el texto. Inténtelo de nuevo.");
                sc.nextLine();
            }
        }
        return dato;
}
}