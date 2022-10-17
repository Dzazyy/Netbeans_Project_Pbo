/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author Acer
 */
public class PersegiPanjang {
    int panjang;
    int lebar;
    
    void kelilingPersegiPanjang() {
        int keliling = 2 * panjang + 2 * lebar;
        System.out.println("Keliling Persegi Panjang = " + keliling);
    }
    
    void luasPersegiPanjang() {
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + luas);
    }

}
