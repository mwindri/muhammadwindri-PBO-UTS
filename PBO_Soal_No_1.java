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
 class Smartphone {
    private int jamAwal, menitAwal, detikAwal;
    private int jamSelesai, menitSelesai, detikSelesai;
    private int lamaPercakapan;
 
    public Smartphone(int jamAwal, int menitAwal, int detikAwal, int jamSelesai, int menitSelesai, int detikSelesai) {
        this.jamAwal = jamAwal;
        this.menitAwal = menitAwal;
        this.detikAwal = detikAwal;
        this.jamSelesai = jamSelesai;
        this.menitSelesai = menitSelesai;
        this.detikSelesai = detikSelesai;
    }

    public int getJamAwal() {
        return jamAwal;
    }

    public void setJamAwal(int jamAwal) {
        this.jamAwal = jamAwal;
    }

    public int getMenitAwal() {
        return menitAwal;
    }

    public void setMenitAwal(int menitAwal) {
        this.menitAwal = menitAwal;
    }

    public int getDetikAwal() {
        return detikAwal;
    }

    public void setDetikAwal(int detikAwal) {
        this.detikAwal = detikAwal;
    }

    public int getJamSelesai() {
        return jamSelesai;
    }

    public void setJamSelesai(int jamSelesai) {
        this.jamSelesai = jamSelesai;
    }

    public int getMenitSelesai() {
        return menitSelesai;
    }

    public void setMenitSelesai(int menitSelesai) {
        this.menitSelesai = menitSelesai;
    }

    public int getDetikSelesai() {
        return detikSelesai;
    }

    public void setDetikSelesai(int detikSelesai) {
        this.detikSelesai = detikSelesai;
    }
   

    public int totalLamaPercakapan() {
        int totalDetikAwal = (jamAwal * 3600) + (menitAwal * 60) + detikAwal;
        int totalDetikSelesai = (jamSelesai * 3600) + (menitSelesai * 60) + detikSelesai;
        lamaPercakapan = totalDetikSelesai - totalDetikAwal;
        return lamaPercakapan;
    }

    public int totalBiayaPercakapan(int lamaPercakapan) {
        int pulsa = lamaPercakapan / 5;
        int biayaPercakapan = pulsa * 150;
        return biayaPercakapan;
    }
}

public class PBO_Soal_No_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan waktu awal percakapan (Jam): ");
        int jamAwal = input.nextInt();
        
        System.out.print("Masukkan waktu awal percakapan (Menit): ");
        int menitAwal = input.nextInt();
        
        System.out.print("Masukkan waktu awal percakapan (Detik): ");
        int detikAwal = input.nextInt();
        
        System.out.print("Masukkan waktu selesai percakapan (Jam): ");
        int jamSelesai = input.nextInt();
        
        System.out.print("Masukkan waktu selesai percakapan (Menit): ");
        int menitSelesai = input.nextInt();
        
        System.out.print("Masukkan waktu selesai percakapan (Detik): ");
        int detikSelesai = input.nextInt();
        input.close();
        
        System.out.println("============================================");
        // Membuat objek Smartphone
        Smartphone smartphone = new Smartphone(jamAwal, menitAwal, detikAwal, jamSelesai, menitSelesai, detikSelesai);

        // Menghitung lama percakapan
        int lamaPercakapan = smartphone.totalLamaPercakapan();
        System.out.println(">> Lama percakapan: " + lamaPercakapan + " detik");

        // Menghitung biaya percakapan
        int biayaPercakapan = smartphone.totalBiayaPercakapan(lamaPercakapan);
        System.out.println(">> Biaya percakapan: Rp. " + biayaPercakapan + ".-");
    }
}   
