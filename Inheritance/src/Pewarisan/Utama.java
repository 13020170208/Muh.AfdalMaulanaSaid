/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author AfdalMaulana
 */
public class Utama {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        Persegi p = new Persegi();  
        p.sisi = 2;
        bd.luas();
        bd.keliling();
        p.luas();
        p.keliling();
    }
}
