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
public class It {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai pegawai1,pegawai2;
        pegawai1 = new Pegawai("Ani","01");
        System.out.println("nama = " +pegawai1.getNama() +" nip =" +pegawai1.getNip());
        pegawai2 = new Pegawai("Budi","02");
        System.out.println("nama = " +pegawai2.getNama() +" nip =" +pegawai2.getNip());
        
        
  
    }    
}
