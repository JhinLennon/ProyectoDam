package claseAlien;

// Clase Nomun (hereda de Alienigena)
public class Nomun extends Aliens {
    private double gradoAutotraslacion;

    public Nomun(double gradoAutotraslacion) {
        super("Nomun");
        this.gradoAutotraslacion = gradoAutotraslacion;
    }

    // Getters y Setters
    public double getGradoAutotraslacion() { return gradoAutotraslacion; }
    public void setGradoAutotraslacion(double gradoAutotraslacion) { this.gradoAutotraslacion = gradoAutotraslacion; }
}