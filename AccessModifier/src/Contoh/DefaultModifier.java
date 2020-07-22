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
class mesin{
    double kecepatan;
    void setCepat(double kecepatan){
        this.kecepatan = kecepatan;
    }
    double getCepat(){
        return kecepatan;
    }
}
public class DefaultModifier {
    public static void main(String[] args) {
        mesin m = new mesin();
        m.setCepat(160.0);
        System.out.println("Kecepatan Kendaraan = "+m.getCepat());
    }
}
