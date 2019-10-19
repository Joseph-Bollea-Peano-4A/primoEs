/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolo;

import javax.swing.JOptionPane;

/**
 *
 * @author joseph.bollea
 */
public class Calcolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b, h;
        b = Integer.parseInt(JOptionPane.showInputDialog("inserisci la base: "));
        h = Integer.parseInt(JOptionPane.showInputDialog("inserisci l'altezza: "));
        System.out.println("Area: " + calcolo(b, h, 'a'));
        System.out.println("Perimetro: " + calcolo(b, h, 'p'));

    }

    public static int calcolo(int b, int h, char c) {
        switch (c) {
            case 'p':
                return 2 * (b + h);
            case 'a':
                return b * h;
            default:
                return 0;
                
        }

    }

}
