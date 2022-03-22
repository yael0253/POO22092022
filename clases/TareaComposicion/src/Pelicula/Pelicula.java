/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

import Componentes.Actor;
import Componentes.Director;
import Componentes.Productora;

/**
 *
 * @author Yael
 */
public class Pelicula {
     private String nombre;
     private int estreno;// Escribir en dd/mm/aa
     private String genero;
     private Director director;
     private Productora productora;
     private Actor actor;

    public Pelicula() {
        director = new Director();
        productora = new Productora();
    }

    public Pelicula(String nombre, int estreno, String genero, Director director, Productora productora, Actor actor) {
        this.nombre = nombre;
        this.estreno = estreno;
        this.genero = genero;
        this.director = director;
        this.productora = productora;
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", estreno=" + estreno + ", genero=" + genero + ", director=" + director + ", productora=" + productora + ", actor=" + actor + '}';
    }
 
}
