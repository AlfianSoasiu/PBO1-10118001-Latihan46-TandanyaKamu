
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Menampilkan output hitung umur
 */
public class TandanyaKamu {
    
    public static void main(String[] args) {
        
        Umur age = new Umur(2019);

        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scn.nextInt());
        
        System.out.println("________Hasil Perhitungan Umur________");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth(0));
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                + age.hitungUmur()+ " tahun");
        System.out.println("Tandanya Kamu : "+ age.tandanyaKamu(age.hitungUmur()));
    }
}
