/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * KELAS        : PBO3
 * DESKRIPSI    : Program ini berisi program untuk mengganti kata
 */
public class PBO310117096Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text,ganti,menjadi;
        System.out.println("====Program Mengganti Kata====");
        System.out.println("Masukan Kalimat :");
        text = in.nextLine();
        System.out.println("Ganti Kata : ");
        ganti = in.nextLine();
        System.out.println("Menjadi Kata : ");
        menjadi = in.nextLine();
        
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal : " +text);
        System.out.println("Kalimat baru : " +text.replace(ganti,menjadi));
        
    }
    
}
