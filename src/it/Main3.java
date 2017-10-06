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
public class Main3 {
    public static void main(String[] args){
        Pegawai man;
        
        man = new Manager("01","Rudi","IT");
        proses(man);
        man = new Pegawai("01","Rudi");
        proses(man);
        
    }
    public static void proses(Pegawai pegawai){
        if(pegawai instanceof Manager){
            System.out.println("Ini manager");
        }else if(pegawai instanceof Pegawai){
            System.out.println("Ini pegawai");
        }
    }
}
