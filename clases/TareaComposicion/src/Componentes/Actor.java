/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author Yael
 */
public class Actor {
    private String nombre;
    private String fechaNac;
    private String paisOrig;
    private int edad;

    public Actor() {
    }

    public Actor(String nombre, String fechaNac, String paisOrig, int edad) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.paisOrig = paisOrig;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getPaisOrig() {
        return paisOrig;
    }

    public void setPaisOrig(String paisOrig) {
        this.paisOrig = paisOrig;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + ", paisOrig=" + paisOrig + ", edad=" + edad + '}';
    }
    
    
}
