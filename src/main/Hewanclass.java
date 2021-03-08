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
//Menggunakan keyword extends
public class Hewanclass extends Main {
    //Mendeklarasikan modifier private
    private double berat;
    private String makanan, nama, jenis;
    
    //Konstruktor = nama method sama dengan class
    public Hewanclass(){
    //Menggunakan keyword super
        super();
        System.out.println("Mari Belajar Mengenal Jenis-Jenis Hewan!");  
    }
    
    //Menggunakan keyword super
    public void cetak(){
        super.Man();
    }
    
    //Method getter untuk berat
    public double getBerat(){
    //mengoutputkan nilai dari sebuah fungsi
        return berat;
    }
    
    //Method setter untuk berat
    public void setBerat(double berat){//Yang di dalam tanda kurung adalah parameter
    //this.variabel digunakan untuk mengakses variabel instance yang dibayangi oleh parameter
        this.berat = berat;
    }
    
    //Method getter untuk makanan
    public String getMakanan(){
    //mengoutputkan nilai dari sebuah fungsi
        return makanan; 
    }
    
    //Method setter untuk makanan
    public void setMakanan(String makanan){//Yang di dalam tanda kurung adalah parameter
    //this.variabel digunakan untuk mengakses variabel instance yang dibayangi oleh parameter
        this.makanan = makanan;
    }
    
    //Method getter untuk nama
    public String getNama(){
    //mengoutputkan nilai dari sebuah fungsi
        return nama;
    }
    
    //Method setter untuk nama
    public void setNama(String nama){//Yang di dalam tanda kurung adalah parameter
    //this.variabel digunakan untuk mengakses variabel instance yang dibayangi oleh parameter
        this.nama = nama;
    }
    
    //Method getter untuk jenis
    public String getJenis(){
    //mengoutputkan nilai dari sebuah fungsi
        return jenis;
    }
    
    //Method setter untuk jenis
    public void setJenis(String jenis){//Yang di dalam tanda kurung adalah parameter
    //this.variabel digunakan untuk mengakses variabel instance yang dibayangi oleh parameter
        this.jenis = jenis;
    }
    
    //Method tampil digunakan untuk menampilkan detail di class Hewanclass
    public void tampil(){
        System.out.println("Nama: "+getNama());
        System.out.println("Berat: "+getBerat());
        System.out.println("Makanan: "+getMakanan());
        System.out.println("Jenis: "+getJenis());
        
    }
    
    
}
