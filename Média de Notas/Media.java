package Java_Project_1;

import java.util.Scanner;

public class Media {
    
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        double armaz_notas = 0;
        int cont_notas = 0;

        System.out.println("Para saber a média das notas dos alunos, siga os seguintes passos: 1°- Informe as notas. 2°- Digite 0 para saber o resultado. ");
        double nota = sc.nextDouble();

        while (nota != 0) {
            
            armaz_notas += nota;
            cont_notas++;
            nota = sc.nextDouble();

        }

        if (cont_notas > 0) {

            double media_notas = armaz_notas/cont_notas;
            System.out.println("A média da nota dos alunos é: " + media_notas);

        } else if (cont_notas == 0) {

            System.out.println("Não foi digitado nenhuma nota. Não é possível realizar a média das notas.");

        }

    }

}
