/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.animale;

/**
 *
 * @author adina
 */
public class Animale {
    String specie;
    int anNastere;

    Animale(){
        specie="nu stiu";
        anNastere=2024;
    }
    Animale(String specie, int anNastere){
        this.specie=specie;
        this.anNastere=anNastere;
    }
    public String toString(){
        return "Animalul este din specia "+specie+" varsta "+(2024-anNastere);
    }
}
