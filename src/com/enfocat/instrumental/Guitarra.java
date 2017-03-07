/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enfocat.instrumental;

/**
 *
 * @author mati
 */
public class Guitarra extends InstrumentoCuerda{

    

    @Override
    public String getNombre() {
        return "Guitarra";
    }

    @Override
    public String getFileName() {
       return "guitarra.mp3";
    }
    
}
