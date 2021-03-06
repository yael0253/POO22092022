/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ico.fes.Alumno;
import ico.fes.Automovil;
import ico.fes.Persona;
import ico.fes.Silla;
import java.awt.Color;

/**
 *
 * @author Yael
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola de nuevo");
        Silla s1 = new Silla();
        System.out.println(s1);
        System.out.println(s1.toString());

        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho.toString());

        Automovil miMustang = new Automovil("Ford", "Mustang", 2010, Color.yellow);
        System.out.println(miMustang);

        Automovil miAcura = new Automovil("Acura", "NSX", 2013, Color.gray);
        System.out.println(miAcura);

        Persona per1 = new Persona();
        per1.setEdad(18);//per1.edad = 20; no se permite por seguridad
        System.out.println(per1);

        Alumno a1 = new Alumno();
        a1.setNombre("Yael");
        System.out.println(a1);
        a1.setEdad(18);
        System.out.println(a1);
        a1.setNumeroCuenta("31911419-7");
        System.out.println(a1);
        a1.setGrupo(2209);
        System.out.println(a1);
    }

}
