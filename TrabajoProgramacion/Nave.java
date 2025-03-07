import claseTripulacion.Tripulacion;
import java.util.*; 

public class Nave {
        private int numRampasDespegue;
        private double potenciaKwMicroSeg;
        private int numMotores;
        private String laboratorios;
        private int tunelesCiclonicos;
        private ArrayList<Tripulacion> tripulantes;

    // Getters y Setters
    public int getNumRampasDespegue() { return numRampasDespegue; }
    public void setNumRampasDespegue(int numRampasDespegue) { this.numRampasDespegue = numRampasDespegue; }

    public double getPotenciaKwMicroSeg() { return potenciaKwMicroSeg; }
    public void setPotenciaKwMicroSeg(double potenciaKwMicroSeg) { this.potenciaKwMicroSeg = potenciaKwMicroSeg; }

    public int getNumMotores() { return numMotores; }
    public void setNumMotores(int numMotores) { this.numMotores = numMotores; }

    public String getLaboratorios() { return laboratorios; }
    public void setLaboratorios(String laboratorios) { this.laboratorios = laboratorios; }

    public int getTunelesCiclonicos() { return tunelesCiclonicos; }
    public void setTunelesCiclonicos(int tunelesCiclonicos) { this.tunelesCiclonicos = tunelesCiclonicos; }

    public List<Tripulacion> getTripulantes() { return tripulantes; }
    public void agregarTripulante(Tripulacion tripulante) { this.tripulantes.add(tripulante);}

}
