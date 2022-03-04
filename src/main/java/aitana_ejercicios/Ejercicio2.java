package aitana_ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {

        double[] numeros = { 12.5, 5.5, 6.7, 4.4, 5.1, 10.9, 9.69 };

        double suma = 0;
        double maximo = 0;
        double minimo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            suma += numeros[i];

            if (numeros[i] > maximo) {

                maximo = numeros[i];

            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];

            }

        }

        System.out.println("EL mayor es: " + maximo + "\n Y este es el minimo: " + minimo);
        System.out.println("La suma total del Array de numeros decimales es: " + suma);

    }
}
