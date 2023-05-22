/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java.coding;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class JavaCoding {
    private double kecepatan;
    private double massa;
    
    public void setKecepatan (double kecepatan){
        this.kecepatan= kecepatan;
    }
    public void setMassa (double massa){
        this.massa= massa;}
    public double getKecepatan ( ){
        return kecepatan;}
     public double getmassa ( ){
        return massa;}
     
      public double rumus() {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }

    public static void main(String[] args) {
            JavaCoding sepeda = new JavaCoding();
            
            System.out.print("Masukkan kecepatan sepeda (m/s): ");
            Scanner varKecepatan = new Scanner(System.in);
            System.out.print("Masukkan massa sepeda (kg): ");
            Scanner varMassa = new Scanner(System.in);
            
            sepeda.setMassa(varMassa.nextDouble());
            sepeda.setKecepatan(varKecepatan.nextDouble());
            
            System.out.println(sepeda.rumus());
    }
}