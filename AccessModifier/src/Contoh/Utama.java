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
public class Utama extends PublicModifier{
    public static void main(String[] args) {
        Utama u = new Utama();
        u.setMerk("Suzuki");
        u.setKecepatan(220.0);
        System.out.println("Merk Mobil = "+u.getMerk());
        System.out.println("Kecepatan tempuh = "+u.getKecepatan());
    }
}
