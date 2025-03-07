package claseVehiculo;

// autor Jorge González

public abstract class Vehiculo {
    String tipoDeMovimiento;
    int capacidadDeposito;
    String estado;

    public Vehiculo(){}

    public Vehiculo(String tipoDeMovimiento, int capacidadDeposito, String estado){
        this.tipoDeMovimiento = tipoDeMovimiento;
        this.capacidadDeposito = capacidadDeposito;
        this.estado = estado;
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

}