package Menu;

import java.util.Scanner;

import Service.ReprodutorMusicalService;

public class ReprodutorMusicalMenu {
    public void menu(Scanner scanner) {
        ReprodutorMusicalService reprodutorMusicalService = new ReprodutorMusicalService();

        int option = 0;

        String url;

        do {
            System.out.println("Menu do Aparelho Telefônico:");
            System.out.println("1. Tocar música");
            System.out.println("2. Pausar música");
            System.out.println("3. Proxima música");
            System.out.println("4. Música anterior");
            System.out.println("5. Selecionar música existente");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    reprodutorMusicalService.tocar();
                    break;
                case 2:
                    reprodutorMusicalService.pausar();
                    break;
                case 3:
                    reprodutorMusicalService.proximo();
                    break;
                case 4:
                    reprodutorMusicalService.anterior();
                    break;
                case 5:
                    System.out.print("Digite o nome da música existente: ");
                    url = scanner.next();
                    reprodutorMusicalService.selecionarMusica(url);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 6);

    }
}
