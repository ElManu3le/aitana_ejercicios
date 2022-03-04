package aitana_ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Me falta quitar los numeros repetidos del algoritmo

        // Lanzar desde el 100 hasta el 1 en regresivo
        //Si es multiplo de 7 [A], si es  multiplo de 2 [B], si es de ambos [AB]


        
        for (int i = 100; i >= 1; i--) {

            System.out.println(i);

            if (i % 7 == 0) {
                System.out.println(i + " [A]");

            }

            if (i % 2 == 0) {
                System.out.println(i + " [B]");

            }

            if ((i % 7 == 0) && (i % 2 == 0)) {
                System.out.println(i + " [AB]");

            }

        }

    }

}
