/*Desarrolle una aplicación en Java que determine si alguno de los clientes de una tienda de departamentos se ha
*excedido del límite de crédito en una cuenta. Para cada cliente se tienen los siguientes datos:
*a) el saldo al inicio del mes.
*b) el total de abonos en el mes.
*c) el total de créditos aplicados a la cuenta del cliente en el mes.
*d) el límite de crédito permitido.
*El programa debe contar con estos datos cargados en variables de tipo entera, y debe calcular el nuevo saldo (= saldo
*inicial + abonos - créditos), mostrar el nuevo balance y determinar si éste excede el límite de crédito del cliente.
*Para los clientes cuyo límite de crédito sea excedido, el programa debe mostrar el mensaje "Se excedió el límite de su
*crédito”
*/

package Punto2;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class punto2 {
    
    static void ingresousuarios(){
    int limitepermitido=500000;
    Scanner entrada = new Scanner (System.in);
    System.out.println("ingrese el monto a inicios de mes: ");
    int saldoinicial= entrada.nextInt();
    
    System.out.println("Total aplicado en creditos: 1000000");
    int cred=1000000;
    
    System.out.println("ingrese el total de dinero abonado en el mes");
    int abonomensual = entrada.nextInt(); 

    int balance=(saldoinicial+abonomensual)-cred;
  
    if(balance<0){
        System.out.println("Se excedió del limite de su crédito");
    
    }else{
        System.out.println("Se ha renovado su crédito");
    }
}
    
static void eleccion(){
    int personas=0;
    do{
        personas =Byte.parseByte(JOptionPane.showInputDialog(
            "Elija su nombre de usuario\n"
            +"1. Nicolle \n"
            +"2. German \n"
            +"3. Kelly \n"
            +"4. Salir\n"));
        switch(personas){
            case 1:
                JOptionPane.showMessageDialog(null, "Adelante");
                ingresousuarios();
                break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Adelante");
                        ingresousuarios();
                        break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Adelante");
                                ingresousuarios();
                                break;
                                    case 4:
                                            personas=4;
                                                    JOptionPane.showMessageDialog(null, "Vuelva pronto");
                                                    break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null, "Opción incorrecta");
                                                            break;
        }

    }while(personas!=4);
    
}
   
    
    public static void main(String[] args) {
      eleccion();  
    }
}
