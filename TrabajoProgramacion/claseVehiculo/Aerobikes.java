package claseVehiculo;

// autor Jorge González

public class Aerobikes extends Vehiculo{
    private double tiempoVuelo;
    private double pesoSoportado;
    private String modelo;

    public Aerobikes (){}

    public Aerobikes (String tipoDeMovimiento, int capacidadDeposito, String estado, double tiempoVuelo, double pesoSoportado, String modelo){
        super (tipoDeMovimiento, capacidadDeposito, estado);
        this.tiempoVuelo = tiempoVuelo;
        this.pesoSoportado = pesoSoportado;
        this.modelo = modelo;
    }

    public double getTiempoVuelo(){
        return tiempoVuelo;
    }

    public void setTiempoVuelo(){
        this.tiempoVuelo=tiempoVuelo;
    }

    public double getPesoSoportado(){
        return pesoSoportado;
    }

    public void setPesoSoportado(){
        this.pesoSoportado=pesoSoportado;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(){
        this.modelo=modelo;
    }
    

}