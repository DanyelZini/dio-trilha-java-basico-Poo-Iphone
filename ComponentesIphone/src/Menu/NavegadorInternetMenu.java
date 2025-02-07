package Menu;

import java.util.Scanner;

import Service.NavegadorInternetService;

public class NavegadorInternetMenu {
    public void menu(Scanner scanner) {
        NavegadorInternetService navegadorInternetService = new NavegadorInternetService();

        int option = 0;

        String url;

        do {
            System.out.println("Menu do Aparelho Telefônico:");
            System.out.println("1. Ir para a Aba existente");
            System.out.println("2. Adicionar nova Aba");
            System.out.println("3. Atualizar página");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Digite o url da aba existente: ");
                    url = scanner.next();
                    navegadorInternetService.exibirPagina(url);
                    break;
                case 2:
                    System.out.print("Digite o url da nova aba: ");
                    url = scanner.next();
                    navegadorInternetService.exibirPagina(url);
                    break;
                case 3:
                    navegadorInternetService.atualizarPagina();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 4);
    }
}
