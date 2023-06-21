package Tudo;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


public class Clientes extends JFrame {

    private DefaultListModel<String> cadastrosModel;
    private JList<String> cadastrosList;

    public static void main(String[] args) {
        Clientes clientes = new Clientes();
        clientes.menu();
    }

    public Clientes() {
        cadastrosModel = new DefaultListModel<>();
        cadastrosList = new JList<>(cadastrosModel);

        JScrollPane scrollPane = new JScrollPane(cadastrosList);
        getContentPane().add(scrollPane);
        
        setTitle("Cadastros");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public void menu() {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:\n1 - Cadastrar Candidato \n2 - Listar clientes \n3- VAGAS"));

        if (opcao == 1) {
            cadastraCurriculo();
        } else if (opcao == 2) {
          
        	listarClientes();
        	
        }else if (opcao == 3) {
                 
             	Empregos em = new Empregos();
             	em.menu();
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida!");
            menu();
        }
    }

    public void cadastraCurriculo() {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome? ");
        String ocupacao = JOptionPane.showInputDialog("Qual é sua ocupação? ");
        int resposta = JOptionPane.showConfirmDialog(null, "GOSTARIA DE CADASTRAR OUTRO Curriculo? ");

        cadastrosModel.addElement("Nome: " + nome + "\n Ocupação: " + ocupacao + "\n");

        if (resposta == JOptionPane.YES_OPTION) {
            cadastraCurriculo();
        }
        else if(resposta == JOptionPane.NO_OPTION){
        	menu();
        }
    }

    public void listarClientes() {
        if (cadastrosModel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há clientes cadastrados.");
        } else {
            JOptionPane.showMessageDialog(null, cadastrosList, "Clientes Cadastrados: ", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
