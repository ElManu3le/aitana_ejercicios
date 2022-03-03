package aitana_ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Me falta quitar los numeros repetidos del algoritmo

        for (int i = 100; i >= 1; i--) {

            if (i%7==0) {
                System.out.println(i + " [A]");
                
            }

            if (i%2==0) {
                System.out.println(i + " [B]");
                
            }

            if ((i%7==0)&&(i%2==0)) {
                System.out.println(i + " [AB]");
                
            }
            
        }
        

    }

}
