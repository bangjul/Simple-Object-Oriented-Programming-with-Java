/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it;

/**
 *
 * @author Julio Alfian
 * @since 21/2/1998
 * @version 1.0
 */
public class Main2 {
    public static void main(String[] args){
        
        Manager m1 = new Manager("03","Candra","TI");
        System.out.println("Nama = "+m1.getNama()+ " Nip = "+m1.getNip()+ " Departemen = "+m1.getDepartemen());
    }
    
}
