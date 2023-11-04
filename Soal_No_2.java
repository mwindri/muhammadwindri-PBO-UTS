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
class BMI {
    private double berat_badan;
    private double tinggi_badan;
    
    public BMI(double berat, double tinggi){
        this.berat_badan = berat;
        this.tinggi_badan = tinggi;
    }

    public double getBerat_badan() {
        return berat_badan;
    }

    public void setBerat_badan(double berat_badan) {
        this.berat_badan = berat_badan;
    }

    public double getTinggi_badan() {
        return tinggi_badan;
    }

    public void setTinggi_badan(double tinggi_badan) {
        this.tinggi_badan = tinggi_badan;
    }
    
    public double hasilBMI(){
        return berat_badan / (tinggi_badan*tinggi_badan);
    }

    public String tentukanStatus() {
        double bmi = hasilBMI();
        if (bmi >= 18.5 && bmi <= 22.9) {
            return "normal";
        } else if (bmi > 22.9) {
            return "overweight";
        } else {
            return "underweight";
        }
    }
}

public class Soal_No_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Berat Badan Anda(kg) : ");
        double berat_badan = input.nextDouble();
        System.out.print("Masukan Tinggi Badan Anda(cm) : ");
        double tinggi_badan = input.nextDouble();
        
        BMI bb = new BMI(berat_badan,tinggi_badan);
        System.out.println("BMI : " + bb.hasilBMI());
        System.out.println("Status Berat Badan : " + bb.tentukanStatus());
    }
}

