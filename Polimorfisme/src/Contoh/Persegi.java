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
public class Persegi extends BangunDatar {
    int sisi;
    public Persegi(int sisi){
        this.sisi = sisi;
    }
    @Override
    public float luas(){
        return this.sisi * this.sisi;
    }
    @Override
    public float keliling(){
        return this.sisi * 4;
    }
}
