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
public class Manager extends Pegawai{
    private String departemen;
    
    
    public Manager( String nip, String nama, String departemen ){
        super(nama, nip);
        this.departemen = departemen;
    }
    
    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }
    public String getDepartemen(){
        return departemen;
    }
    
}
