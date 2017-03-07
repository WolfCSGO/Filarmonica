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
public class Violin extends InstrumentoViento{


    @Override
    public String getNombre() {
       return "Violin";
    }

    @Override
    public String getFileName() {
        return "violin.mp3";
    }
    
}
