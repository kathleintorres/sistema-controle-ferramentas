import java.util.ArrayList;
import java.util.List;

public class ControleFerramentas {

    private List<Ferramenta> ferramentas;

    public ControleFerramentas() {
        ferramentas = new ArrayList<>();
    }

    // Cadastrar ferramenta
    public void cadastrarFerramenta(Ferramenta ferramenta) {
        ferramentas.add(ferramenta);
    }

    // Listar ferramentas
    public void listarFerramentas() {

        if (ferramentas.isEmpty()) {
            System.out.println("Nenhuma ferramenta cadastrada.");
            return;
        }

        for (Ferramenta ferramenta : ferramentas) {
            System.out.println("Ferramenta: " + ferramenta.getNome());
            System.out.println("Quantidade: " + ferramenta.getQuantidade());
            System.out.println("------------------------");
        }
    }

    // Registrar retirada
    public boolean registrarRetirada(String nomeFerramenta, Funcionario funcionario) {

        for (Ferramenta ferramenta : ferramentas) {

            if (ferramenta.getNome().equalsIgnoreCase(nomeFerramenta)) {

                if (ferramenta.getQuantidade() > 0) {
                    ferramenta.setQuantidade(ferramenta.getQuantidade() - 1);

                    System.out.println("Retirada registrada para: "
                            + funcionario.getNome());

                    return true;

                } else {
                    System.out.println("Não há quantidade disponível.");
                    return false;
                }
            }
        }

        System.out.println("Ferramenta não encontrada.");
        return false;
    }

    // Registrar devolução
    public boolean registrarDevolucao(String nomeFerramenta, Funcionario funcionario) {

        for (Ferramenta ferramenta : ferramentas) {

            if (ferramenta.getNome().equalsIgnoreCase(nomeFerramenta)) {

                ferramenta.setQuantidade(ferramenta.getQuantidade() + 1);

                System.out.println("Devolução registrada para: "
                        + funcionario.getNome());

                return true;
            }
        }

        System.out.println("Ferramenta não encontrada.");
        return false;
    }
}

