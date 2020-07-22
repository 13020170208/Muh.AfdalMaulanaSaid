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
public class PublicModifier {
    public String merk;
    public double kecepatan;
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setKecepatan(double kecepatan){
        this.kecepatan = kecepatan;
    }
    public String getMerk(){
        return merk;
    }
    public double getKecepatan(){
        return kecepatan;
    }
}
