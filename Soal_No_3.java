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
class TotalBilangan {
    private int[] bilangan = new int[10];

    public int[] getBilangan() {
        return bilangan;
    }

    public void setBilangan(int[] bilangan) {
        this.bilangan = bilangan;
    }

    public void inputBilangan() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan bilangan ke- " + (i+1) + ": ");
            bilangan[i] = input.nextInt();
        }
    }

    public int jmlBilangan(int n) {
        if (n == 0) {
            return bilangan[0];
        } else {
            return bilangan[n] + jmlBilangan(n-1);
        }
    }
}
public class Soal_No_3{
    public static void main(String[] args) {
        TotalBilangan jb = new TotalBilangan();
        jb.inputBilangan();
        int jumlah = jb.jmlBilangan(9);
        System.out.println("=========================");
        System.out.println("Hasil Jumlah Bilangan: " + jumlah);
    }
}
