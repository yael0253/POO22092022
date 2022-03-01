/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.awt.Color;

/**
 *
 * @author Yael
 */
public class Silla {
private String marca;
private Color color;  

    public Silla() {
    }

    public Silla(String marca, Color color) {
        this.marca = marca;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
  
}
