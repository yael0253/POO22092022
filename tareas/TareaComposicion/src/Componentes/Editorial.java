/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author Yael
 */
public class Editorial {
    private String nombreEdit;
    private String direccion;
    private String email;

    public Editorial() {
    }

    public Editorial(String nombreEdit, String direccion, String email) {
        this.nombreEdit = nombreEdit;
        this.direccion = direccion;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEdit() {
        return nombreEdit;
    }

    public void setNombreEdit(String nombreEdit) {
        this.nombreEdit = nombreEdit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombreEdit=" + nombreEdit + ", direccion=" + direccion + ", email=" + email + '}';
    }
    
}
