/*
 Realizar un juego para adivinar un numero. Para ello generar un numero aleatorio entre 0-100, y luego ir 
pidiendo numeros indicando si es mayor o menor según sea mayor o menor con respecto a N. El proceso termina 
cuando el usuario acierta y mostrar el numero de intentos. 
 */
package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, aleatorio, contador = 0;
        
        aleatorio = (int)(Math.random()*100);
        
        do {
            numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
            if (aleatorio > numero){
                System.out.println("Digite un número mayor");
            }
            else {
                System.out.println("Digite un número menor");
                
            }
            contador ++;
        }
        while (numero != aleatorio);
        System.out.println("\nGenial!! adivinaste el numero en "+contador+" intentos");
    }
        
    }
    

