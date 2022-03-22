/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author Yael
 */
public class Productora {
private String nombrePro;
private String creacion;
private String email;

    public Productora() {
    }

    public Productora(String nombrePro, String creacion, String email) {
        this.nombrePro = nombrePro;
        this.creacion = creacion;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getCreacion() {
        return creacion;
    }

    public void setCreacion(String creacion) {
        this.creacion = creacion;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombrePro=" + nombrePro + ", creacion=" + creacion + ", email=" + email + '}';
    }

}
