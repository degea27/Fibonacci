
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Fibonacci {

    
    public static void main(String[] args) {//psvm tab
        Scanner entrada = new Scanner(System.in);
        int cambio, limite, temporal, intercambio, i;
        cambio = 0;
        intercambio = 1;
        System.out.println("Digite hasta donde desea la sucesion");
        limite=entrada.nextInt();
        System.out.println("----------------------");
        for (i = 1; i <= limite; i++) {
            System.out.println(cambio);
            temporal=intercambio+cambio;
            cambio=intercambio;
            intercambio=temporal;
        }
    }
    
}
