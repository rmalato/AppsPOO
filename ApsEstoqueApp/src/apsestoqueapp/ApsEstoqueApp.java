
package apsestoqueapp;

/**
 *
 * @author Rodrigo Malato and Iran Lopes
 */
public class ApsEstoqueApp {


    public static void main(String[] args) {
        // TODO code application logic here
        Eletronico e1;
        e1 = new Eletronico( 110, 50, 'A', 233, "RodLED", "Electrolux", 33, 25);
        System.out.println(e1.toString());
    }
    
}
