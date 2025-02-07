package Menu;

import java.util.Scanner;

import Service.AparelhoTelefonicoService;

public class AparelhoTelefonicoMenu {
    public void menu(Scanner scanner) {
        AparelhoTelefonicoService aparelhoTelefonicoService = new AparelhoTelefonicoService();

        int option = 0;

        String numero;

        do {
            System.out.println("Menu do Aparelho Telefônico:");
            System.out.println("1. Fazer uma chamada");
            System.out.println("2. Desligar chamada");
            System.out.println("3. Atender chamada");
            System.out.println("4. Iniciar correio de voz");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Digite o número para ligar: ");
                    numero = scanner.next();
                    aparelhoTelefonicoService.ligar(numero);
                    break;
                case 2:
                    aparelhoTelefonicoService.desligar();
                    break;
                case 3:
                    aparelhoTelefonicoService.atender();
                    break;
                case 4:
                    aparelhoTelefonicoService.iniciarCorreioVoz();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 5);

    }
}
