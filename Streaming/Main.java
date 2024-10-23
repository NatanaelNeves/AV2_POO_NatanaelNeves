package Streaming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Streaming> streamings = new ArrayList<>();

        while (true) {
            System.out.println("Digite o tipo de conteúdo (1 - Série, 2 - Filme, 0 - Sair e mostrar os conteudos): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); 

            if (tipo == 0) {
                break;
            }

            System.out.print("Digite o título: ");
            String titulo = scanner.nextLine();
            System.out.print("Digite o gênero: ");
            String genero = scanner.nextLine();

            if (tipo == 1) {
                System.out.print("Digite o número de temporadas: ");
                int temporadas = scanner.nextInt();
                streamings.add(new Serie(titulo, genero, temporadas));
            } else if (tipo == 2) {
                System.out.print("Digite a duração em minutos: ");
                int duracao = scanner.nextInt();
                streamings.add(new Filme(titulo, genero, duracao));
            }
        }

        System.out.println("\nConteúdos cadastrados:");
        for (Streaming streaming : streamings) {
            streaming.tipoStreaming();
            System.out.println(streaming);
        }

        scanner.close();
    }
}

