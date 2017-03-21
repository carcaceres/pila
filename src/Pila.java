/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Pila {
    private int tam;
    private String pila[];
    private int maxPila;
    
    // metodo ingrese tamaño de pila
    public void tamPila(int tam){
        this.maxPila=tam;
        this.tam=tam-1;
        pila=new String[tam]; 
    }
    
    // metodo llenar elemento de la pila
    public void llenarPila(String n){
        if(tam==maxPila){
            tam=maxPila-1;
        }
        if(tam>=0){
        pila[tam]=n;
        tam--;
        }
        else{
            System.out.println("desborde de pila");
        }
    }
    
    // metodo quitar elemento de la pila
     public void quitarPila(){
       if(tam!=maxPila){
         if(tam==-1){
             tam=0;
         }
       pila[tam]=null;
       tam++;
       }
         
    }
    
      // metodo muestra la pila
    public void mostrarPila(){
        int i;
        for(i=0;i<pila.length;i++){
        if(pila[i]==null){
             System.out.println("| |");
        }   
        else{
        System.out.println("|"+pila[i]+"|");
        }
        }
    }
    
    // metodo vacia la pila
     public void vaciarPila(){
         int i;
     
        for(i=0;i<pila.length;i++){
        pila[i]=null;
        } 
        tam=maxPila-1;
        System.out.println("pila fue vaceada");
         
    }
     // metodo muestra el tamaño de la pila
    
    public void maximoPila(){
        System.out.println("Tamaño Pila "+maxPila);
    }
    
    
    
}
