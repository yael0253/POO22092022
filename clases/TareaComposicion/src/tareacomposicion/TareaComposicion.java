/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;
import Componentes.Actor;
import Componentes.Autor;
import Componentes.Director;
import Componentes.Editorial;
import Componentes.Productora;
import Libro.Libro;
import Pelicula.Pelicula;
/**
 *
 * @author Yael
 */
public class TareaComposicion {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro miLibro = new Libro ();
        miLibro.setTitulo("it");
       miLibro.setAutor(new Autor("Stephen King", "21 de septiembre de 1947", "Estados Unidos"));
       miLibro.setEditorial(new Editorial("DeBolsillo", "Blvd. Miguel de Cervantes Saavedra 301 piso 1,Granada", "andrea.hernandez@penguinrandomhouse.com"));
       miLibro.setPaginas(480);
        System.out.println(miLibro);
       
        System.out.println("-----------------------------");
        
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Spiderman: No way home");
        miPelicula.setEstreno(15/12/21);
        miPelicula.setGenero("Accion y ciencia ficcion");
        miPelicula.setDirector(new Director("Jon watts", "28 de junio de 1981", "Estados Unidos"));
        miPelicula.setProductora(new Productora("Marvel y SONY", "2 de mayo del 2008", "Se desconoce"));
        miPelicula.setActor(new Actor("Tom Holland", "01/06/96", "Estados Unidos", 25));
        System.out.println(miPelicula);
      
    }
    
}
