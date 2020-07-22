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
public class Main extends ProtectedModifier{
    public static void main(String[] args) {
        Main m = new Main();
        m.setHidup(true);
        System.out.println("Makanan saya = "+m.makanan);
        System.out.println("Saya Alhamdulillah Hidup : "+m.getHidup());
    }
}
