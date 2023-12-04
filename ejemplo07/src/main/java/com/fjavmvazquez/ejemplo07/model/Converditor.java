/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fjavmvazquez.ejemplo07.model;

/**
 *
 * @author catcr
 */
public class Converditor {
    private final String faren;

    public Converditor(String faren) {
        this.faren = faren;
    }


    public String getFaren() {
        return faren;
    }

    @Override
    public String toString() {
        return "Converditor{" + "faren=" + faren +'}';
    }
    
}
