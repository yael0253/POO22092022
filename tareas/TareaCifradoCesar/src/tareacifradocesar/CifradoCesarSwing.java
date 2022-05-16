/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacifradocesar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.InputMismatchException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Yael
 */
public class CifradoCesarSwing extends JFrame {

    private JTextField cuadroNumero;
    private JTextField cuadroPalabra;
    private JButton convertir;
    private JLabel desplazamiento;
    private JLabel texto1;
    private JLabel resultado;

    public CifradoCesarSwing() throws HeadlessException {
        setTitle("Cifrado Cesar");
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        cuadroNumero = new JTextField(20);
        desplazamiento = new JLabel("Tipo de desplazamiento");
        cuadroPalabra = new JTextField(20);

        convertir = new JButton("Encriptar");
        convertir.setBackground(Color.RED);
        convertir.setOpaque(true);
        convertir.setToolTipText("Click para encriptar");
        texto1 = new JLabel("Palabra a encriptar");
        resultado = new JLabel("");
        this.getContentPane().add(desplazamiento);
        this.getContentPane().add(cuadroNumero);
        setLayout(new FlowLayout(FlowLayout.LEADING));
        this.getContentPane().add(texto1);
        this.getContentPane().add(cuadroPalabra);
        this.getContentPane().add(convertir);
        this.getContentPane().add(resultado);
        this.validate();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
        this.convertir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                String textoCodificado;
                textoCodificado = "";
                String palabra;
                palabra = cuadroPalabra.getText();
                int desplazamiento = Integer.parseInt(cuadroNumero.getText());
                try {
                    palabra = palabra.toUpperCase();
                    char caracter;
                    for (int i = 0; i < palabra.length(); i++) {
                        caracter = palabra.charAt(i);

                        int pos = letras.indexOf(caracter);

                        if (pos == -1) {
                            textoCodificado += caracter;
                        } else {
                            textoCodificado += letras.charAt((pos + desplazamiento) % letras.length());
                        }
                         resultado.setText("Palabra encriptada: " + textoCodificado);
                    }

                } catch (Exception xe) {
                    System.out.println(xe.toString());
                    JOptionPane.showMessageDialog(null, "Introduce un valo numerico", "ERROR de captura", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

}
