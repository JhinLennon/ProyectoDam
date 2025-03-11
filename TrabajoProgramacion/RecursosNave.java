public class RecursosNave {
    private double Oxigeno;
    private double Agua;
    private double Alimentos;
    private double Energia;
    private double Combustible;
    
    final private double ConsumoOxigenoBase = 5.0; //Por hora.
    final private double ConsumoAguaBase = 2.0; //Por día.
    final private double ConsumoAlimentosBase = 0.5; //Por día.
    
    
    public RecursosNave(double EnergiaInicial, double AguaInicial, double OxigenoInicial, double AlimentoInicial, double CombustibleInicial){
        this.Energia = EnergiaInicial;
        this.Agua = AguaInicial;
        this.Oxigeno = OxigenoInicial;
        this.Alimentos = AlimentoInicial;
        this.Combustible = CombustibleInicial;
    }
    
    public void ConsumirOxigeno(int NumeroTripulantes, double TiempoHoras){
        double ConsumoTotal = NumeroTripulantes * ConsumoOxigenoBase * TiempoHoras;
        if (Oxigeno - ConsumoTotal < 0){
            throw new RuntimeException ("¡Oxigeno insuficiente! Tripulacion en peligro");
        }
        
        Oxigeno -= ConsumoTotal;
        
    }
    
    public void ConsumirAgua (int NumeroTripulantes, int TiempoDia){
        double ConsumoTotal = NumeroTripulantes * ConsumoAguaBase * TiempoDia;
        if (Agua - ConsumoTotal < 0){
            throw new RuntimeException ("¡Agua insuficiente! Tripulacion en peligro.");
        }
        
        Agua -= ConsumoTotal;
    }
    
    public void ConsumirEnergia(double KW){
        if (Energia < 0){
            throw new RuntimeException ("¡Energía agotada! Sistemas criticos desconectados.");
        }
        
        Energia -= KW;
        
    }
    
    public void ConsumoAlimento(int NumeroTripulantes, double TiempoDia){
        double ConsumoTotal = NumeroTripulantes * ConsumoAlimentosBase * TiempoDia;
        if (Alimentos - ConsumoTotal < 0){
            throw new RuntimeException ("¡Alimentos insuficientes! Tripulacion en peligro.");
        }
        
        Alimentos -= ConsumoTotal;
    }
    
    public void ConsumoCombustible(double Litros){
        if (Combustible - Litros < 0){
            throw new RuntimeException ("¡Combustible insuficiente! Vehiculos inoperativos.");
        }
        
        Combustible -= Litros;
    }
    
    public double getOxigeno(){ return Oxigeno; }
    public double getAgua() { return Agua; }
    public double getEnergia() { return Energia; }
    public double getAlimentos() { return Alimentos; }
    public double getCombustible() { return Combustible; }
     
}
