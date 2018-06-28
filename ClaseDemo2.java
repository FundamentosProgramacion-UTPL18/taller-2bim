/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos2;

/**
 *
 * @author reroes
 */
public class ClaseDemo2 {
    int suma; // variable global
    
    public void presentar_variable(){
        System.out.printf("%d\n", suma);
    }
    
    public void agregar_restar_valor(int x){
        
        suma = suma + x;
    }
    
    
}
