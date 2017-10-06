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
public class Pegawai {
    /**
     * variabel nama dan nip
     */
    private String nama; //variabel nama untuk pegawai
    private String nip; //variabel nip untuk pegawai
    private int nomor;
    
    
    public Pegawai(String nama, String nip){
        /**
         * kontructor class pegawai
         */
        this.nama = nama;
        this.nip = nip;
    }

    public String getNama() {
        /**
         * getter getNama
         */
        return nama;
    }

    public void setNama(String nama) {
        /**
         * setter setNama
         */
        this.nama = nama;
    }

    public String getNip() {
        /**
         * getter getNip
         */
        return nip;
    }

    public void setNip(String nip) {
        /**
         * setter getNip
         */
        this.nip = nip;
    }
}
