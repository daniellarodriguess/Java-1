package Java_Project_1;

import java.util.Scanner;

public class Classificador {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Informe sua idade. A partir disso, classificaremos você como uma criança, um jovem, um adulto ou um idoso - caso a criança possua dias ou meses de vida, digite zero. Se você desejar encerrar o programa, digite -1. ");

        do {

            System.out.println("\nQual é a sua idade?");
            int idade = sc.nextInt();            

            if (idade >= 0 && idade < 13 ) {

                System.out.println("\nVocê é uma criança!");

            } else if (idade > 13 && idade <= 17) {

                System.out.println("\nVocê é um jovem!");

            } else if (idade > 17 && idade <= 59) {

                System.out.println("\nVocê é um adulto!");

            } else if (idade >= 60) {

                System.out.println("\nVocê é um idoso!");

            } else if (idade == -1) {
                System.out.println("\nObrigado por utilizar nosso programa. ");
                break;
            }
            
        } while (true);

    }
}