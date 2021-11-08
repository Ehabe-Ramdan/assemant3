/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ball implements tossable{
    String brandName;

    public ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
    void bounce(){
        System.out.println(" this is ounce");
    }

    @Override
    public void toss() {
        
        System.out.println(" | ");
    }

 
}
