/*Una empresa grande paga a sus vendedores mediante comisiones. Los vendedores reciben $200 por semana, más el
*9% de sus ventas brutas durante esa semana. Por ejemplo, un vendedor que vende $5,000 de mercancía en una
*semana, recibe $200 más el 9% de 5,000, o un total de $650 en esa semana.
*Del mismo modo, la empresa premia a los vendedores que cumplan los objetivos de venta con un incremento en el
*pago de la semana, de acuerdo a las siguientes categorías de vendedores:
*A – incrementa el pago semanal en 5% si las ventas superan $3000, en 7% sin son entre $5000 y $7000, y 10% si
*superan los $7000.
*B – incrementa el pago semanal en 7% si las ventas superan $5000, %10 si son entre %10000 y $15000, 13% si
*superan los $15000.
*Si usted cuenta con el registro de ventas semanales realizadas por un vendedor almacenados en un arreglo, cuál sería
*el pago semanal en cada categoría?
*/
package Punto3;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class punto3 {
    
    
    static int[] ventas;
    JTextArea salida = new JTextArea();
    
    
    static void casoA(){
        int suma =0;
        int val1=0, val2 = 0, val3, val4, val5, val6, val7;
        for (int b=0; b<ventas.length; b++){
            suma= suma + ventas[b];
            val1= (int) (suma*0.09);
        } 
        
        if (suma>3000 && suma<5000){
        val2=(int) (suma*0.05);
        val3=suma+val1+val2+200;
        JOptionPane.showMessageDialog(null,"El pago semanal de este trabajador para la categoria A es de: "+val3);     
        }
        
        else if(suma>=5000 && suma<=7000){
        val4=(int)(suma*0.07);
        val5=suma+val1+val4+200;
        JOptionPane.showMessageDialog(null,"El pago semanal de este trabajador para la categoria A es de: "+val5);
        }
        
        else if(suma>7000){
        val6=(int)(suma*0.1);
        val7=suma+val1+val6+200;
        JOptionPane.showMessageDialog(null,"El pago semanal de este trabajador para la categoria A es de: "+val7);                 
        }
        
        else if(suma<3000){
        JOptionPane.showMessageDialog(null,"Las ventas de la semana no fueron suficientes para alcanzar la categoria A");
        }
        
    }
    static void casoB(){
    int suma =0;
    int val1=0, val2 = 0, val3, val4, val5, val6, val7;
        for (int b=0; b<ventas.length; b++){
            suma= suma + ventas[b];
            val1= (int) (suma*0.09);         
        } 
    if (suma>5000 && suma<10000){   
        val2=(int) (suma*0.07);
        val3=suma+val1+val2+200;
        JOptionPane.showMessageDialog(null,"El pago semanal de este trabajador para la categoria B es de: "+val3);
    }
    else if(suma>=10000 && suma<=15000){
        val4=(int)(suma*0.1);
        val5=suma+val1+val4+200;
        JOptionPane.showMessageDialog(null,"El pago semanal de este trabajador para la categoria B es de: "+val5);
    }
    else if(suma>15000){
        val6=(int)(suma*0.13);
        val7=suma+val1+val6+200;
        JOptionPane.showMessageDialog(null,"El pago semanal de este trabajador para la categoria B es de: "+val7);                 
    }
    else if(suma<5000){
        JOptionPane.showMessageDialog(null,"Las ventas de la semana no fueron suficientes para alcanzar la categoria B");
    }
        
    }
    
    static void ingresodatos(){
         
        String vendedor;
        ventas = new int [8];
        
        vendedor=JOptionPane.showInputDialog("Ingrese su nombre");
        
        for (int b = 1; b <ventas.length; b++) {
            ventas[b]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de sus ventas del dia " +b));
        }
    
        casoA();
        casoB();
    }   
    public static void main(String[] args) {
        ingresodatos();
    }
}
