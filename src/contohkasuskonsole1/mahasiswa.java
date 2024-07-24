/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contohkasuskonsole1;

/**
 *
 * @author HP Pavilion Aero 13
 */
public class mahasiswa 
{
    //Atribut
    private String nim;
    private String nama;
    public Double nilai;
    
    //Method
    public void set_nim(String nim)
    {
        this.nim = nim;
    }
    
    public String get_nim()
    {
        return nim;
    }
    
    public void set_nama(String nama)
    {
        this.nama = nama;
    }
    
    public String get_nama()
    {
        return nama;
    }
    
    public void set_nilai(Double nilai)
    {
        this.nilai = nilai;
    }
    
    public Double hitung_nilai()
    {
        return 0.35 * nilai;
    }
}
