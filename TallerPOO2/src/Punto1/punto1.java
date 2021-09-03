/*Un vendedor minorista en línea requiere un informe de las ventas del día. Para ello cuenta con tres arreglos de n
*elementos cada uno: A, B y C. El primero almacena el código de los productos vendidos en el día, El segundo almacena
*el valor de venta de cada producto, y el tercero la cantidad de unidades vendidas de cada producto.
* Requiere un aplicativo que le calcule rápidamente los siguientes datos:
*Total productos vendidos en el día.
*Total ingresos por ventas del día.
*El producto más vendido.
 *producto más costoso vendido.
*/

package Punto1;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class punto1 {
    
    static int[] A;
    static int[] B;
    static int [] C;
    JTextArea salida = new JTextArea();
    
    static void prodvendidos(int C[]){
        
        int suma =0;
        for (int g=0; g<C.length; g++){
            suma= suma + C[g];
        } 
        JOptionPane.showMessageDialog(null,"El total de productos vendidos en el dia fue de: "+suma);
        
    }
    
    static void ingreventas(int B[]){
        
        int suma =0;
        for (int g=0; g<B.length; g++){
            suma= suma + B[g];
        }    
        JOptionPane.showMessageDialog(null,"El total de ingresos del dia fue de: "+suma);
        
        
    }
    
    static void prodmasvendido (int A[], int C[]){
        
        int masvendido = C[0];
        for (int g=0; g<C.length; g++){
            if (C[g] > masvendido)
                masvendido=A[g];
        }
        JOptionPane.showMessageDialog(null,"El producto más vendido fue el código: "+masvendido);
        
        
    }
    
    static void prodmascostoso (int A[], int B[]){
        int mascostoso = B[0];
        for (int g=0; g<B.length; g++){
            if (B[g] > mascostoso)
                mascostoso=A[g];
        }
        
        JOptionPane.showMessageDialog(null,"El producto más costoso vendido fue el código: "+mascostoso);
    
    }
        public static void main(String[] args) {
        JTextArea salida = new JTextArea();
        int tam=Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos desea ingresar: "));
        
        A=new int[tam];
        B=new int[tam];
        C=new int[tam];
        
        for (int g = 0; g <A.length; g++) {
            A[g]=Integer.parseInt(JOptionPane.showInputDialog("Ingresar código del producto: "));
            
            B[g]=Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor de venta del producto: "));
            
            C[g]=Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de unidades vendidas del producto: "));           
    }
            
        salida.setText ("Código\tValor\tcant\n\n");
        for (int g = 0; g <A.length; g++) {
         salida.append(A[g]+"\t" +B[g]+"\t"+C[g]+"\n\n");
        }
        JOptionPane.showMessageDialog( null,salida);
        prodvendidos(C);
        ingreventas(B);
        prodmasvendido(A,C);
        prodmascostoso(A,B);
        
}
     
    
}
