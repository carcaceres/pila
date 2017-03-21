/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila pila= new Pila();
        pila.tamPila(4);
        pila.llenarPila("3");
        pila.llenarPila("4");
         pila.llenarPila("2");
         pila.llenarPila("1");
         pila.quitarPila();
         pila.quitarPila();
         pila.quitarPila();
         pila.quitarPila();
         pila.llenarPila("1");
         pila.llenarPila("1");
         pila.llenarPila("1");
         pila.vaciarPila();
         pila.llenarPila("1");
         pila.mostrarPila();
         pila.maximoPila();
        
    }
    
}
