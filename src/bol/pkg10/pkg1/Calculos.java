package bol.pkg10.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Calculos {

    int numeroAdivinar;
    int numeroIntentos;

    public int introduccionNumero() {
        do {
            numeroAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1: Introduce un numero entre 1 y 50 a adivinar"));
        } while (numeroAdivinar < 1 | numeroAdivinar > 50);
        return numeroAdivinar;
    }

    public int introduccionIntentos() {
        numeroIntentos = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1: Introduce numero de intentos para el jugador 2"));
        return numeroIntentos;
    }

    public void comparar() {

        numeroIntentos = introduccionIntentos();
        numeroAdivinar = introduccionNumero();
        for (int i = 0; i < numeroIntentos; i++) {
            int numRespuesta = Integer.parseInt(JOptionPane.showInputDialog("Jugador 2: Adivina un numero entre el 1 y el 50"));
            if (numRespuesta > numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "¡¡¡INCORRECTO!!! Te has pasado");
            } 
            else if (numRespuesta < numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "¡¡¡INCORRECTO!!! Te has quedado corto");
            } 
            else if (numRespuesta == numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "Has acertado");
                break;
            }

        }
    }
}
