/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author Yael
 */
public class Autor {
    private String nombre;
    private String nacimiento;
    private String paisOrig;

    public Autor() {
    }

    public Autor(String nombre, String nacimiento, String paisOrig) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.paisOrig = paisOrig;
    }

    public String getPaisOrig() {
        return paisOrig;
    }

    public void setPaisOrig(String paisOrig) {
        this.paisOrig = paisOrig;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + ", paisOrig=" + paisOrig + '}';
    }
    
}
