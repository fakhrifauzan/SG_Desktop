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
public class Mahasiswa {
    private String nama;
    private int umur;
    private double ipk;

    public Mahasiswa(String nama, int umur, double ipk) {
        this.nama = nama;
        this.umur = umur;
        this.ipk = ipk;
    }
    
    public Mahasiswa() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    
}
