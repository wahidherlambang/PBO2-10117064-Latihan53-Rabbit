/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan53.rabbit;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program tentang kelinci 
 * yang bernana Peter.
 */
public class Rabbit extends Animal{
    private String color;
    private String name;

    
    public Rabbit(String name,boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.name=name;
        this.vegetarian=veg;
        this.eats=food;
        this.noOfLegs=legs;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
