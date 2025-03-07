package claseAlien;

// Clase Raiser (hereda de Alienigena)
public class Raiser extends Aliens {
    private double gradoInvisibilidad;

    public Raiser(double gradoInvisibilidad) {
        super("Raiser");
        this.gradoInvisibilidad = gradoInvisibilidad;
    }

    // Getters y Setters
    public double getGradoInvisibilidad() { return gradoInvisibilidad; }
    public void setGradoInvisibilidad(double gradoInvisibilidad) { this.gradoInvisibilidad = gradoInvisibilidad; }
}