/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectpengubinan;

/**
 *
 * @author Acer
 */
public class Ubin {
    // panjang ubin
    int panjang;
    // lebar ubin
    int lebar;
    
    // menghitung luas sebuah ubin
    int hitungLuas(){
        // menghitung luas dengan memanfaatkan class persegi panjang
        PersegiPanjang k = new PersegiPanjang();
               
        // hitung luasnya
        return k.hitungLuas(this.panjang, this.lebar);
    }
}
