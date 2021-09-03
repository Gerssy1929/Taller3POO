package Punto11;

/*Escriba un método que tome un valor entero y devuelva el número con sus dígitos invertidos. Por ejemplo, para el
*número 7631, el método debe regresar 1367. Incorpore el método en una aplicación que reciba como entrada un
*valor del usuario y muestre el resultado.
*package Punto11;
*/

import javax.swing.JOptionPane;


public class punto11 {
    
    static void inversonumero(){
      
       int num1=0,div,inv=0;
       
       num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
       
       while(num1>0){
            
           div=num1%10;
           
           inv=inv*10+div;
           
           num1/=10; 
             
        }
           
          JOptionPane.showMessageDialog(null,"El numero invertido es: "+inv);
                      
          opciones();
    } 
 
 static void opciones(){
        
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        switch (opcion) {
            case 0:
                inversonumero();
                break;
            case 1:
                System.exit(0);
                break;
            default:
                break;
        }
    }
 
  
    public static void main(String[] args) {
        inversonumero();
       
    }

}

