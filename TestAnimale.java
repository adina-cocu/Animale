/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.animale;

import java.util.ArrayList;

/**
 *
 * @author adina
 */
public class TestAnimale {

    public static void main(String[] args) {
        Animale[] a = new Animale[5];
        ArrayList<Pisica> p = new ArrayList();
        a[0] = new Animale();
        a[1] = new Animale("feline", 2020);
        a[2] = new Animale("canide", 2019);
        p.add(new Pisica());
        p.add(new Pisica("feline", 2021, "scotish", "gri"));
        p.add(new Pisica());
        p.add(new Pisica("feline", 2015, "common", "negru"));
        for (Animale i : a) {
            System.out.println(i);
        }
        for (Pisica i : p) {
            System.out.println(i);
        }
        //System.out.println(p.get(4));
    }
}
