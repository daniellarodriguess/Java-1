package Java_Project_1;

import java.util.Random;
import java.util.Scanner;

public class Gerador {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Random gerador = new Random();

        int contador = 0;
        int numero_gerado = gerador.nextInt(11);
        System.out.println("Tente adivinhar o número aleatório. \n");

        while (true) {
            
            System.out.println("Informe um número. ");
            int palpite = sc.nextInt();
            contador++;

            if (numero_gerado == palpite) {

                System.out.println("\nParabéns! Você acertou o número gerado. O número gerado era o " + numero_gerado + ".");
                System.out.println("Você tentou " + contador + " vezes.");
                break;

            } else {

                System.out.println("Você errou. Tente novamente!\n");

            }



        }

    }

}
