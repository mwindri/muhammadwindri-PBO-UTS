/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.upj.tif.pbo_uts;
import java.util.Scanner;
/**
 *
 * @author MuhammadWindri - 2022071092 - INFORMATIKA
 */
class Lingkaran {
    private double jariJari;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public double luasLingkaran(){
        return Math.PI*jariJari*jariJari;
    }
    
    public double kelilingLingkaran(){
        return 2*Math.PI*jariJari;
    }   
}

public class Soal_No_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lingkaran lingkaran = new Lingkaran();
        
        System.out.print("Masukan Jari-Jari Lingkaran : ");
        double jariJari = input.nextDouble();
        lingkaran.setJariJari(jariJari);
        
        System.out.println(" >> Luas Lingkaran : " + lingkaran.luasLingkaran());
        System.out.println(" >> Keliling Lingkaran : " + lingkaran.kelilingLingkaran());
        
    }
}
