package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Personagem> personagens = new ArrayList<>();

        while (true) {
            System.out.println("Digite o tipo de personagem (1 - Arqueiro, 2 - Cavaleiro, 3 - Mago, 0- Sair e mostrar os personagens): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); 

            if (tipo == 0) {
                break;
            }

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o nível: ");
            int nivel = scanner.nextInt();

            if (tipo == 1) {
                System.out.print("Digite o número de flechas: ");
                int flechas = scanner.nextInt();
                personagens.add(new Arqueiro(nome, nivel, flechas));
            } else if (tipo == 2) {
                System.out.print("Digite o valor da armadura: ");
                int armadura = scanner.nextInt();
                personagens.add(new Cavaleiro(nome, nivel, armadura));
            } else if (tipo == 3) {
                System.out.print("Digite o valor de mana: ");
                int mana = scanner.nextInt();
                personagens.add(new Mago(nome, nivel, mana));
            }
        }

        System.out.println("Personagens cadastrados:");
        for (Personagem personagem : personagens) {
            personagem.tipoPersonagem();
            System.out.println(personagem);
        }

        scanner.close();
    }
}

