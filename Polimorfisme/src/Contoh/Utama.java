/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoh;

/**
 *
 * @author AfdalMaulana
 */
public class Utama {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        Persegi p = new Persegi(4);
        bd.luas();
        System.out.println("Luas Persegi "+p.luas());
        bd.keliling();
        System.out.println("Keliling Persegi "+p.keliling());
    }
}
