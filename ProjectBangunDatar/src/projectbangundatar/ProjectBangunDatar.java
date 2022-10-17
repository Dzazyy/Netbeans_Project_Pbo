/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbangundatar;
import java.util.*;
/**
 *
 * @author Acer
 */
public class ProjectBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // membuat obyek persegi panjang A
        // membuat obyek persegi panjang A
        Scanner input = new Scanner(System.in);
        PersegiPanjang A = new PersegiPanjang();
        System.out.println("Masukan bilangan persegi panjang A");
        System.out.println("Panjangnya a");
        int panjang = input.nextInt();
        System.out.println("lebarnya a");
        int lebar = input.nextInt();
        A.panjang = panjang;
        A.lebar = lebar;
        
        System.out.println("Panjang : " + A.panjang);
        System.out.println("Lebar : " + A.lebar);

        A.kelilingPersegiPanjang();
        A.luasPersegiPanjang();
        
        PersegiPanjang B = new PersegiPanjang();
        System.out.println("Masukan bilangan persegi panjang B");
        System.out.println("Panjangnya B");
        panjang = input.nextInt();
        System.out.println("lebarnya B");
        lebar = input.nextInt();
        B.panjang = panjang;
        B.lebar = lebar;
        
        System.out.println("Panjang : " + B.panjang);
        System.out.println("Lebar : " + B.lebar);
        B.kelilingPersegiPanjang();
        B.luasPersegiPanjang();
        
        PersegiPanjang C = new PersegiPanjang();
        
        C.panjang = 17;
        C.lebar = 8;
        
        C.luasPersegiPanjang();
        C.kelilingPersegiPanjang();
        
        PersegiPanjang D = new PersegiPanjang();
        
        D.panjang = 26;
        D.lebar = 14;
        
        D.luasPersegiPanjang();
        D.kelilingPersegiPanjang();
        
        Lingkaran L1 = new Lingkaran();
        
        L1.jejari = 6;
        
        L1.hitungKeliling();
        L1.hitungLuas();
        
        
        Lingkaran L2 = new Lingkaran();
        
        L2.jejari = 12;
        
        L2.hitungKeliling();
        L2.hitungLuas();

    }
    

}
