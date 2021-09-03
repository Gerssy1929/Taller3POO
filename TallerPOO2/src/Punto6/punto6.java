

//Desarrolle un aplicativo en Java que dada un cantidad en binario (0 y 1) lo transforme a decimal, y viceversa
package Punto6;


import javax.swing.JOptionPane;



public class punto6 {
    
    
    static void binariodecimal(){
      long binario;
      int decimal = 0;
      int digito;
      
      binario=Long.parseLong(JOptionPane.showInputDialog("ingrese el número binario a convertir"));
      
      
        final long divisor = 10;
        for (long g = binario, j = 0; g > 0; g /= divisor, j++) {
            digito = (int) (g % divisor);
            if (digito != 0 && digito != 1) {
                JOptionPane.showMessageDialog(null, -1);
            }
            decimal += digito * Math.pow(2, j);
        }
        JOptionPane.showMessageDialog(null,"El número convertido a decimal es: "+decimal);
 
    }
    
    static void decimalbinario(){
       long binario = 0;
       int digito;
       int decimal;
  
       decimal=Integer.parseInt(JOptionPane.showInputDialog("ingrese el número entero a convertir (Positivo)"));
        final int divisor = 2;
        for (int i = decimal, j = 0; i > 0; i /= divisor, j++) {
            digito = i % divisor;
            binario += digito * Math.pow(10, j);
        }
        JOptionPane.showMessageDialog(null,"El número convertido a binario es: "+ binario);
    }
    
    public static void main(String[] args) {
         boolean salir = false;
    int opcion=0;
    
    while (!salir){
          
        try{
        
        opcion= Integer.parseInt(JOptionPane.showInputDialog("Menú\nElija una de las siguientes opciones:\nOpción 1 (Binario a decimal)\nOpción 2 (Decimal a binario)\nOpción 3 (Salir) "));
        
        switch(opcion){
            
            case 1:
                JOptionPane.showMessageDialog(null, "A continuación la opción 1");
                binariodecimal();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "A continuación la opción 2");
                decimalbinario();
                break; 
                case 3:
                salir=true;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Las opciones son entre 1 y 5");
        }
    } catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Debes ingresar un número");
        
    }  
        
  
}
    JOptionPane.showMessageDialog(null, "Fin del Menú");
}
}
   

