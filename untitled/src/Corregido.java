// Corregido por Juan Manuel Galán Pérez

import java.util.Scanner;

public class Corregido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bucleProg = true;

        while (bucleProg) {
            int numRan = (int) (Math.random() * 100) + 1;
            for (int jkafj = 1; jkafj < 100; jkafj++) {
                int intento = sc.nextInt();

                if (intento == 67) System.out.println("67 67 67 67 67 67 67");
                else if (numRan > intento) {
                    System.out.println("El intento es menor al número random");
                } else if (intento > numRan) {
                    System.out.println("El intento es mayor al numero random");
                } else if (intento == numRan) {
                    System.out.println("Correcto");
                    break;
                }
            }
            bucleProg = false;
        }
    }
}