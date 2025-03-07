package claseMascota;
import claseTripulacion.*;
//Lucia 
public abstract class Mascota extends Tripulacion {

    //Atributo tipo de mascota (perro, gato, etc...)
    private String tipo;
    private String codigo;
    
    //Constructor para los atributos || luego el get y set 
    public Mascota(String tipo, String codigo, String nombre, String genero) {
        super(nombre, genero);
        this.tipo = tipo;
        codigo=crearCodigo();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    public String crearCodigo(){
        return "";
    }

    //Métodos abstractos 

    public abstract double horasDormir();
    public abstract double cantidadAlimento();
    public abstract String sonidoEmitido();
    public abstract String tipoDeMovimiento();

}