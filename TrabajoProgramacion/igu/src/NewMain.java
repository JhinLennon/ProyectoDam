
public class NewMain {


    public static void main(String[] args) {
        
        
        Home casa = new Home();
        Pantalla panta = new Pantalla();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null); 
        
        
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(50);
                panta.progreso.setValue(i);
                panta.porcenta.setText(Integer.toString(i)+"%");
            }
        }catch(Exception e){
    }
    
        panta.setVisible(false);
        casa.setVisible(true);
        casa.setLocationRelativeTo(null); 
        
        panta.disable();
}
   
}
