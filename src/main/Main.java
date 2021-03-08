/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //object
        Kelinci object = new Kelinci();
        //menjalankan method setter untuk nama 
        object.setNama("Kelinci Eropa");
        //menjalankan method setter untuk berat
        object.setBerat(2.5);
        //menjalankan method setter untuk jenis
        object.setJenis("Herbivora");
        //menjalankan method setter untuk makanan
        object.setMakanan("Sayur-Sayuran");
        //untuk menjalankan method tampil
        object.tampil();
        //untuk menjalankan method cetak
        object.cetak();
        
        //object
        Harimau objek = new Harimau();
        //menjalankan method setter untuk nama
        objek.setNama("Harimau Amur");
        //menjalankan method setter untuk berat
        objek.setBerat(110.25);
        //menjalankan method setter untuk jenis
        objek.setJenis("Karnivora");
        //menjalankan method setter untuk makanan
        objek.setMakanan("Daging");
        //untuk menjalankan method tampil
        objek.tampil();
        //untuk menjalankan method cetak
        objek.cetak();
    }
    
    //Konstruktor
    public Main(){
        System.out.println("Halo Teman-Teman!!!");
    }
    
    //Method cetak = super.Man
    void Man(){
        System.out.println("Terimakasih Telah Belajar Bersama!");
    }
    
    
    }
    
    
    
    

