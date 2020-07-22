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
class Latihan {
    private String bahasa = "Java";
    public String getBahasa(){
        return bahasa;
    }
}
public class PrivateModifier extends Latihan{
    public static void main(String[] args) {
        PrivateModifier pm = new PrivateModifier();
        System.out.println("Bahasa Pemrograman = "+pm.getBahasa());
    }
}
