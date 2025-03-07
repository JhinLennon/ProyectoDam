package claseMascota;
//Lucia
public class perro extends Mascota implements PropietarioMascota{

    //Nuevo atrib
    private String raza;

    public perro(String tipo, String codigo, String nombre, String genero, String raza) {
        super(tipo, codigo , nombre, genero);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }   

    //Métodos abstractos

    @Override //este dudo
    public void designarPropietario() {
        System.out.println("El propietario de la mascota es: ");
    }
    
    @Override
    public double horasDormir() {
        return 8;
    }
    
    @Override
    public double cantidadAlimento() {
        return 2;
    }

    @Override
    public String sonidoEmitido() {
        return "Guau, Woof";
    }

    @Override
    public String tipoDeMovimiento() {
        return "Cola, Jadear";
    }
}
