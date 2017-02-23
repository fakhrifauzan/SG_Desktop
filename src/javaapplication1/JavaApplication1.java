/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Fakhri Fauzan 
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa m1 = new Mahasiswa("Doni", 18, 3.0);
        Mahasiswa m2 = new Mahasiswa("Angga", 22, 3.0);
        Mahasiswa m3 = new Mahasiswa("Danu", 14, 3.0);
        
        Mahasiswa m4 = new Mahasiswa();
        
        System.out.println("Nama Mahasiswa 1 : "+m1.getNama());
    }
    
}
