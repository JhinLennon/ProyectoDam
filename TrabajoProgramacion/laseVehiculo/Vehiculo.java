package claseVehiculo;

// autor Jorge González

public abstract class Vehiculo {
    String tipoDeMovimiento;
    int capacidadDeposito;
    String estado;
    double consumoPorKm;

    public Vehiculo(){}

    public Vehiculo(String tipoDeMovimiento, int capacidadDeposito, String estado, double consumoPorKm){
        this.tipoDeMovimiento = tipoDeMovimiento;
        this.capacidadDeposito = capacidadDeposito;
        this.estado = estado;
        this.consumoPorKm = consumoPorKm;
    }

    public String getTipoDeMovimiento() {
        return tipoDeMovimiento;
    }

    public void setTipoDeMovimiento(String tipoDeMovimiento) {
        this.tipoDeMovimiento = tipoDeMovimiento;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getConsumoPorKm() { 
        return consumoPorKm; 
    }

    public void setConsumoPorKm(double consumoPorKm) { 
        this.consumoPorKm = consumoPorKm; 
    } 

}