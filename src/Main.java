import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ControleFerramentas controle = new ControleFerramentas();

        int opcao = 0;

        while (opcao != 5) {

            System.out.println("===== CONTROLE DE FERRAMENTAS =====");
            System.out.println("1 - Cadastrar ferramenta");
            System.out.println("2 - Listar ferramentas");
            System.out.println("3 - Registrar retirada");
            System.out.println("4 - Registrar devolução");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da ferramenta: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    if (quantidade <= 0) {
                        System.out.println("A quantidade deve ser maior que zero.");
                        break;
                    }

                    Ferramenta ferramenta = new Ferramenta(nome, quantidade);
                    controle.cadastrarFerramenta(ferramenta);

                    System.out.println("Ferramenta cadastrada com sucesso!");
                    break;

                case 2:
                    controle.listarFerramentas();
                    break;

                case 3:
                    System.out.print("Digite o nome do funcionário: ");
                    String nomeFuncionario = scanner.nextLine();

                    System.out.print("Digite o nome da ferramenta: ");
                    String nomeFerramenta = scanner.nextLine();

                    Funcionario funcionario = new Funcionario(nomeFuncionario);

                    controle.registrarRetirada(nomeFerramenta, funcionario);
                    break;

                case 4:
                    System.out.print("Digite o nome do funcionário: ");
                    String nomeFuncionarioDevolucao = scanner.nextLine();

                    System.out.print("Digite o nome da ferramenta: ");
                    String nomeFerramentaDevolucao = scanner.nextLine();

                    Funcionario funcionarioDevolucao =
                            new Funcionario(nomeFuncionarioDevolucao);

                    controle.registrarDevolucao(
                            nomeFerramentaDevolucao,
                            funcionarioDevolucao
                    );

                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}