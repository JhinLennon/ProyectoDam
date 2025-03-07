package claseTripulacion;

import java.io.*;
import java.util.*;

public class Nombres {

    private static final File AP = new File("TrabajoProgramacion\\claseTripulacion\\apellidos.txt");
    private static final File NM = new File("TrabajoProgramacion\\claseTripulacion\\nombres_M.txt");
    private static final File NF = new File("TrabajoProgramacion\\claseTripulacion\\nombres_F.txt");
     private static String  genero;

    public Nombres() {
        validarExistenciaArchivos();
    }


    private void validarExistenciaArchivos() {
        if (!AP.exists() || !NM.exists() || !NF.exists()) {
            throw new IllegalStateException("Uno o más archivos no existen.");
        }
    }

    public static String getNombreM() {
        return obtenerNombreAleatorio(NM);
    }

    public static String getNombreF() {
        return obtenerNombreAleatorio(NF);
    }

    public static String getApellido() {
        return obtenerNombreAleatorio(AP);
    }

    private static String obtenerNombreAleatorio(File archivo) {
        ArrayList<String> arr = cargarArr(archivo);
        if (arr.isEmpty()) {
            return "No hay datos en " + archivo.getName();
        }
        return arr.get(generarNumeroRandom(arr));
    }

    public static ArrayList<String> cargarArr(File f) {
        ArrayList<String> arr = new ArrayList<>();
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNextLine()) {
                arr.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo: " + f.getName());
        }
        return arr;
    }

    public static int generarNumeroRandom(ArrayList<String> arr) {
        Random random = new Random();
        return random.nextInt(arr.size());
    }

    public static String darNombre(){
         Random random = new Random();
        boolean gen=random.nextBoolean();

        if(gen){
            genero="M";
            return getNombreM()+" "+getApellido();
        }
        else {genero="F";
            return getNombreF()+" "+getApellido();}
    }

    public static String getGenero(){
        return genero;
    }
}
