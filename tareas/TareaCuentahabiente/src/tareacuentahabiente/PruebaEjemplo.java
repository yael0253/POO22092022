/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacuentahabiente;

/**
 *
 * @author Yael
 */
public class PruebaEjemplo {

    public static void main(String[] args) {
        System.out.println("Arreglos de cuentahabientes");
        Cuentahabiente[] lista = new Cuentahabiente[5];
        lista[0] = new Cuentahabiente("00001", "Martinez Isidro", 85000f);
        lista[1] = new Cuentahabiente("00011", "Rosales Maria", 60000f);
        lista[2] = new Cuentahabiente("00111", "Luna Sergio", 90000f);
        lista[3] = new Cuentahabiente("01111", "Rodiguez Ismael", 49000f);
        lista[4] = new Cuentahabiente("11111", "Perez Juan", 30000f);
        for (int i = 0; i < lista.length; i++) {
            Cuentahabiente cuentahabiente = lista[i];
            System.out.println(cuentahabiente.evaluarNivelCliente());
        }
        System.out.println("Arreglo con For Each");
        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente.evaluarNivelCliente());

        }
    }

}
