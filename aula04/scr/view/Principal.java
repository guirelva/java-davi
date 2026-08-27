package view;

import business.Carro;
import business.Moto;
import business.Veiculo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Veículo ===");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.print("Escolha o tipo de veículo: ");
        int opcao = lerInteiro(scanner);

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Fabricante: ");
        String fabricante = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = lerInteiro(scanner);

        Veiculo veiculo;

        if (opcao == 1) {
            System.out.print("Quantidade de portas: ");
            int portas = lerInteiro(scanner);
            veiculo = new Carro(modelo, fabricante, ano, portas); 
        } else {
            veiculo = new Moto(modelo, fabricante, ano); 
        }

        System.out.println("\nVeículo cadastrado com sucesso!");
        System.out.println(veiculo);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Desacelerar");
            System.out.println("3 - Parar (desaceleração total)");
            System.out.println("4 - Exibir estado atual");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int acao = lerInteiro(scanner);

            switch (acao) {
                case 1:
                    veiculo.acelerar();
                    System.out.println(veiculo);
                    break;
                case 2:
                    veiculo.desacelerar();
                    System.out.println(veiculo);
                    break;
                case 3:
                    veiculo.parar();
                    System.out.println(veiculo);
                    break;
                case 4:
                    System.out.println(veiculo);
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
            if (continuar) {
                if (veiculo instanceof Carro) {
                    Carro carro = (Carro) veiculo; // downcasting
                    System.out.println("(Info específica de Carro) Portas: " + carro.getQuantidadePortas());
                } else if (veiculo instanceof Moto) {
                    Moto moto = (Moto) veiculo; // downcasting
                    System.out.println("(Info específica de Moto) Descanso acionado: "
                            + (moto.isDescansoAcionado() ? "Sim" : "Não"));
                }
            }
        }

        scanner.close();
    }

    private static int lerInteiro(Scanner scanner) {
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
}