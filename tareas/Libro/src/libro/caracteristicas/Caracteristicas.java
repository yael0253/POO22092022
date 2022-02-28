/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.caracteristicas;

/**
 *
 * @author Yael
 */
public class Caracteristicas {

    private String nombre;
    private String autor;
    private String editorial;
    private int ano;
    private int paginas;
    private String categoria;

    public Caracteristicas() {
    }

    public Caracteristicas(String nombre, String autor, String editorial, int ano, int paginas, String categoria) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.ano = ano;
        this.paginas = paginas;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
public void parado(){
    System.out.println("El libro " + this.nombre + " esta parado");
}
public void acostado(){
    System.out.println("El libro " + this.nombre + " esta acostado");
}
public void leyendo(){
    System.out.println("Se esta leyendo el libro " + this.nombre);
}

}
