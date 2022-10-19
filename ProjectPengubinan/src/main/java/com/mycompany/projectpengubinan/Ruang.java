/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectpengubinan;

/**
 *
 * @author Acer
 */
public class Ruang {
    // panjang ruang 	
    int panjang;
    // lebar ruang
    int lebar;
    
    int hitungLuas(){
               
// menghitung luas dengan memanfaatkan class persegi panjang
                // hitung luasnya
        return PersegiPanjang.perkalian(this.panjang, this.lebar);
    }
}
