import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Moradia> moradias = new ArrayList<>();

        while (true) {
            System.out.println("Digite o tipo de moradia (1 - Casa, 2 - Apartamento, 0 - Sair e mostrar as moradias): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); 

            if (tipo == 0) {
                break;
            }

            System.out.print("Digite o endereço: ");
            String endereco = scanner.nextLine();
            System.out.print("Digite o número de quartos: ");
            int quartos = scanner.nextInt();

            if (tipo == 1) {
                System.out.print("Tem quintal?");
                boolean temQuintal = scanner.nextBoolean();
                moradias.add(new Casa(endereco, quartos, temQuintal));
            } else if (tipo == 2) {
                System.out.print("Digite o andar: ");
                int andar = scanner.nextInt();
                moradias.add(new Apartamento(endereco, quartos, andar));
            }
        }

        System.out.println("Moradias cadastradas:");
        for (Moradia moradia : moradias) {
            moradia.tipoMoradia();
            System.out.println(moradia);
        }

        scanner.close();
    }
}
 
