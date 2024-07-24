/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contohkasuskonsole1;

/**
 *
 * @author HP Pavilion Aero 13
 */
import java.util.Scanner;
public class Contohkasuskonsole1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //membuat objek
        mahasiswa mhs = new mahasiswa();
        Scanner papanketik = new Scanner(System.in);
        
        //input
        System.out.println("Masukkan NIM Anda : ");
        mhs.set_nim(papanketik.next());
        
        System.out.println("Masukkan NAMA Anda : ");
        mhs.set_nama(papanketik.next());
        
        System.out.println("Masukkan Nilai Anda : ");
        mhs.set_nilai(papanketik.nextDouble());
        
        //output
        System.out.println("NIM Anda Adalah  :\t "+mhs.get_nim());
        System.out.println("Nama Anda Adalah :\t "+mhs.get_nama());
        System.out.println("Nilai Anda Adalah :\t "+mhs.hitung_nilai());
    }
    
}
