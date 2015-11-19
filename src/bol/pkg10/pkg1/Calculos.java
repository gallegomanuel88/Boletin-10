package bol.pkg10.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Calculos {

    int numeroAd;
    int numeroMax;
    
    public int introduccionNumero() {
        do {
            numeroAd = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1: Introduce un numero entre 1 y 50 a adivinar"));
        } while (numeroAd < 1 | numeroAd > 50);
        return numeroAd;
    }

    public int introduccionIntentos() {
        numeroMax = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1: Introduce numero de intentos para el jugador 2"));
        return numeroMax;
    }

    public void comparar() {
        
        numeroMax = introduccionIntentos();
        numeroAd = introduccionNumero();
        for (int i = 0; i < numeroMax; i++) {
            int numRespuesta = Integer.parseInt(JOptionPane.showInputDialog("Jugador 2: Adivina un numero entre el 1 y el 50"));
            if (numRespuesta > numeroAd) {
                JOptionPane.showMessageDialog(null, "Te has pasado");
            } else if (numRespuesta < numeroAd) {
                JOptionPane.showMessageDialog(null, "Te has quedado corto");
            }
            else if (numRespuesta == numeroAd) {
                JOptionPane.showMessageDialog(null, "Has acertado");
                break;
            }
            
        }
    }
}
