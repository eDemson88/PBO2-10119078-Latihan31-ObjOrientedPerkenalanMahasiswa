/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan31.objorientedperkenalanmahasiswa;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class Mahasiswa {
    public String nama;
    public String nim;


public void setNim (String nim){
    this.nim = nim;
}
public void setNama(String nama){
    this.nama = nama;
}


public void perkenalanDiri(){
    System.out.println("Hallo everyone");
    System.out.println("My NIM is " + nim);
    System.out.println("My Name is " + nama + "\n");

    
}

}