package Entity;

import Service.NavegadorInternetService;
import Service.ReprodutorMusicalService;
import java.util.Scanner;

import Menu.AparelhoTelefonicoMenu;
import Menu.NavegadorInternetMenu;
import Menu.ReprodutorMusicalMenu;

public class Iphone {
    
    AparelhoTelefonicoMenu aparelhoTelefonicoMenu = new AparelhoTelefonicoMenu();
    NavegadorInternetMenu navegadorInternetMenu = new NavegadorInternetMenu();
    ReprodutorMusicalMenu reprodutorMusicalMenu = new ReprodutorMusicalMenu();

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Usar Aparelho Telefônico");
            System.out.println("2. Navegar na Internet");
            System.out.println("3. Reproduzir Música");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    aparelhoTelefonicoMenu.menu(scanner);
                    break;
                case 2:
                    navegadorInternetMenu.menu(scanner);
                    break;
                case 3:
                    reprodutorMusicalMenu.menu(scanner);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
