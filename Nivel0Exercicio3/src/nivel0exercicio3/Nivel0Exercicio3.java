
package nivel0exercicio3;

import java.util.Scanner;


public class Nivel0Exercicio3 {

   
    public static void main(String[] args) {
       
        Scanner leia = new Scanner(System.in);
        
        System.out.println ("Conversão de Números de Meses para Números de Dias");
     
        System.out.println ("Digite o Número de Meses:");
        double numeromeses = leia.nextDouble();
                
        double resultado = (numeromeses * 30);
        System.out.println ("Corresponde a "+resultado+" dias" );

    }
    
}
