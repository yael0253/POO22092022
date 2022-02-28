/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

import libro.caracteristicas.Caracteristicas;

/**
 *
 * @author Yael
 */
public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caracteristicas eso = new Caracteristicas();
        eso.setNombre("IT");
        System.out.println("Nombre de libro: " + eso.getNombre());
        eso.setAutor("Stephen King");
        System.out.println("Autor: " + eso.getAutor());
        eso.setAno(1986);
        System.out.println("Año de publicacion: " + eso.getAno());
        eso.setPaginas(1504);
        System.out.println("Paginas: " + eso.getPaginas());
        eso.setEditorial("DEBOLSILLO");
        System.out.println("Editorial: " + eso.getEditorial());
        eso.setCategoria("Suspenso y terror");
        System.out.println("Genero: " + eso.getCategoria());

    }

}
