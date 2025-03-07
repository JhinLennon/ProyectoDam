package claseAlien;

// Clase Alien (superclase hecha de alienigena)
public abstract class Aliens {
    private String tipo;
    

    public Aliens(String tipo) {
        this.tipo = tipo;
    }

    // Métodos comunes
    public void comer() { System.out.println("El alienígena está comiendo."); }
    public void dormir() { System.out.println("El alienígena está durmiendo."); }
    public void atacar() { System.out.println("El alienígena está atacando."); }

    // Getters y Setters
    public String getTipo() {
        return tipo; 
    }
    public void setTipo(String tipo) {
        this.tipo = tipo; 
    }
}