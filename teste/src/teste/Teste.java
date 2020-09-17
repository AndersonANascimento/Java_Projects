/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.LinkedList;

/**
 *
 * @author P000994
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        lista.add("Ana");
        lista.add("Rosa");
        lista.add("Bia");
        lista.add("paula");
        lista.add("Maria");
        
        System.out.println(lista.poll());
    }
    
}
