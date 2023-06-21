package Tudo;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.util.ArrayList;

public class Empregos {

    private DefaultListModel<String> cadastrosModel2 = new DefaultListModel<>();

    public static void main(String[] args) {
        Empregos empregos = new Empregos();
        empregos.menu();
    }

    /**
     * Exibe o menu principal e realiza ações com base na opção escolhida pelo usuário.
     */
    public void menu() {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha uma opção:\n" +
                        "1. Cadastrar vaga\n" +
                        "2. Listar vagas\n" +
                        "3. Buscar vaga\n" +
                        "4. Sair"));

        switch (opcao) {
            case 1:
                cadastrarVaga();
                break;
            case 2:
                listarVagas();
                break;
            case 3:
                buscarVaga();
                break;
            case 4:
                Clientes c = new Clientes();
                c.menu();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                menu();
        }
    }

    /**
     * Permite cadastrar uma nova vaga de emprego, solicitando informações ao usuário.
     * Após o cadastro, pergunta se deseja cadastrar outra vaga ou voltar ao menu principal.
     */
    public void cadastrarVaga() {
        String funcao = JOptionPane.showInputDialog("Qual a Área da vaga? ");
        String requisito = JOptionPane.showInputDialog("Qual requisito? ");
        String quantvagas = JOptionPane.showInputDialog("Quantas vagas disponíveis? ");

        cadastrosModel2.addElement(" FUNÇÃO: " + funcao + "\n  REQUISITOS: " + requisito + "\n\n  VAGAS DISPONÍVEIS: " + quantvagas);

        int resposta = JOptionPane.showConfirmDialog(null, "GOSTARIA DE CADASTRAR OUTRA VAGA? ");

        if (resposta == JOptionPane.YES_OPTION) {
            cadastrarVaga();
        } else {
            menu();
        }
    }

    /**
     * Lista todas as vagas de emprego cadastradas.
     * Caso não haja vagas cadastradas, exibe uma mensagem informando que não foram encontradas vagas.
     * Após a exibição da lista, retorna ao menu principal.
     */
    public void listarVagas() {
        if (cadastrosModel2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não foram encontradas vagas cadastradas.");
        } else {
            JList<String> vagasList = new JList<>(cadastrosModel2);
            JScrollPane scrollPane = new JScrollPane(vagasList);
            JOptionPane.showMessageDialog(null, scrollPane, "Lista de Vagas Cadastradas: ", JOptionPane.PLAIN_MESSAGE);
        }
        menu();
    }

    /**
     * Busca vagas de emprego com base em uma função pretendida, informada pelo usuário.
     * Exibe as vagas encontradas ou uma mensagem informando que não foram encontradas vagas.
     * Após a exibição do resultado, retorna ao menu principal.
     */
    public void buscarVaga() {
        String busca = JOptionPane.showInputDialog("Digite a função pretendida:");

        ArrayList<String> vagasEncontradas = new ArrayList<>();

        for (int i = 0; i < cadastrosModel2.size(); i++) {
            String funcao = cadastrosModel2.getElementAt(i);
            if (funcao.contains(busca)) {
                vagasEncontradas.add(funcao);
            }
        }

        if (vagasEncontradas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não foram encontradas vagas para a função pretendida.");
        } else {
            JOptionPane.showMessageDialog(null, "Vagas encontradas:\n" + String.join("\n\n", vagasEncontradas));
        }
        menu();
    }

    // Getters e Setters

    
    //getter a seguir responsável por retornar o valor do atributo cadastrosModel2, que é um objeto do tipo DefaultListModel<String>.
    
    public DefaultListModel<String> getCadastrosModel2() {
        return cadastrosModel2;
    }

    public void setCadastrosModel2(DefaultListModel<String> cadastrosModel2) {
        this.cadastrosModel2 = cadastrosModel2;
    }
}
