/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan46.tandanya.kamu;

import java.util.Scanner;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * kelas: IF-1
 * NIM  : 10119014
 */
public class IF110119014Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    Age umur = new Age(2020);
    
    System.out.println();
    System.out.println();
    System.out.println("====Hasil Perhitungan Umur====");
    int yearBirth = umur.getyearBirth();
    System.out.println("Tahun Lahir Anda : " + yearBirth);
    int yearNow = umur.getYearNow();
    System.out.println("Hari ini Tahun : " + yearNow);
    int usia = umur.hitungUmur();
    System.out.println("Umur kamu sampai hari ini adalah " + usia + "tahun ");
    System.out.println("Tandanya kamu " + umur.tandanyaKamu(usia));
    }
}
