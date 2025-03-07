package claseVehiculo;

// autor Jorge González

public class Aerocars extends Vehiculo {
    private int tripulantes;
    private int puertas;
    private double velocidadMaxima;

    public Aerocars (){}

    public Aerocars (String tipoDeMovimiento, int capacidadDeposito, String estado, int tripulantes, int puertas, double velocidadMaxima){
    super (tipoDeMovimiento, capacidadDeposito, estado);
    this.tripulantes= tripulantes;
    this.puertas= puertas; 
    this.velocidadMaxima = velocidadMaxima;
    }

    public int getTripulantes(){
        return tripulantes;
    }

    public void setTripulantes(){
        this.tripulantes=tripulantes;
    }

    public int getPuertas(){
        return puertas;
    }

    public void setPuertas(){
        this.puertas=puertas;
    }

    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(){
        this.velocidadMaxima=velocidadMaxima;
    }

}