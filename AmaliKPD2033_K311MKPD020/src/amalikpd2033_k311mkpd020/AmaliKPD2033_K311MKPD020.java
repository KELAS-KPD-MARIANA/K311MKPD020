/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amalikpd2033_k311mkpd020;

import java.util.Scanner;
public class AmaliKPD2033_K311MKPD020 {
    public static void main(String[] args) {
         String nama;
        int harikerja;
        double gajiperhari = 160;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();

        System.out.print("Masukkan jumlah hari bekerja: ");
        harikerja = input.nextInt();

        while (harikerja > 31) {
            System.out.println("Bilangan hari tidak boleh melebihi 31 hari.");
            System.out.print("Masukkan kembali jumlah hari bekerja: ");
            harikerja = input.nextInt();
        }

        double gaji = harikerja * gajiperhari;

        System.out.println("Rumusan gaji bulanan untuk :" + nama );
        System.out.println("Jumlah hari bekerja: " + harikerja);
        System.out.println("GAJI SEBULAN ADALAH: " + gaji);

        
    }
    
}
