/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.animale;

/**
 *
 * @author adina
 */
public class Pisica extends Animale{
    String rasa, culoare;
    
    Pisica(){
        super();
        rasa="comuna";
        culoare="portocaliu";
    }
    Pisica(String specie, int anNastere, String rasa, String culoare){
        super(specie,anNastere);
        this.rasa=rasa;
        this.culoare=culoare;
    }
    public String toString(){
        return super.toString()+"\n\t rasa "+rasa+" are culoarea "+culoare;
    }
}
