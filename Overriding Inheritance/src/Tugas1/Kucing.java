/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author AfdalMaulana
 */
public class Kucing extends Hewan { //Inheritance Kucing(SubClass) Hewan(SuperClass)
    private String suara="";
    @Override
    public void action(){
        super.action();
        System.out.println("Kucing dapat berjalan dan bersuara'"+suara+"'");
    }
    public void setSuara(String suara){
        this.suara=suara;
    }
}
