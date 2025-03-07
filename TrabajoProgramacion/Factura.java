public class Factura{
    private double[][] matriz;

    //Constructor, va a recibir una matriz cuadrada de costes
    public Factura(double[][] matriz){
        this.matriz=matriz;
    }

    //Metodo que calcula el total en double de la factura
    public double calcularTotal(){
        double total = 0;
        for(int i = 0;i<matriz.length;i++){
            for(int j = 0;j<matriz[i].length;j++){
                total += matriz[i][j];
            }
        }
        return total;
    }

    // Método para imprimir la factura
    
}