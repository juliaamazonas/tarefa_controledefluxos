package br.com.juliaamazonasa;

import java.util.Scanner;

public class CalculadoraDeMedias {

    public static int numeroSoma;

    public static void main(String args[]) {

        calculaSoma();
        calculaMedia();


    }



    public static void calculaSoma() {
            Scanner s = new Scanner(System.in);

            System.out.print("Digite a nota 1: ");

            int nota1 = s.nextInt();

            System.out.print("Digite a nota2: ");

            int nota2 = s.nextInt();

            System.out.print("Digite a nota 3: ");

            int nota3 = s.nextInt();

            System.out.print("Digite a nota 4: ");

            int nota4 = s.nextInt();

            numeroSoma = nota1 +  nota2 + nota3 + nota4;


    }



    public static void calculaMedia() {

        float numeroMedia = (float) numeroSoma / 4;

        System.out.println("Média do aluno: " + numeroMedia);

        if(numeroMedia >= 7) {
            System.out.println("APROVADO");
        } else if (numeroMedia >= 5 && numeroMedia < 7) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }

    }


}



