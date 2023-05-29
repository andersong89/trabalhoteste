package Tudo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Clientes {

	
	int cont=0;
	
	
	String menu=JOptionPane.showInputDialog("1-Cadastrar Candidato\n2-Concorrer a vaga ");

	ArrayList<String> cadastraCurriculo( ) {
	
	
		String nome=JOptionPane.showInputDialog("Qual é o seu nome? ");

		String ocupacao=JOptionPane.showInputDialog("Qual é sua ocupação? ");
		int resposta;
		  resposta = JOptionPane.showConfirmDialog(null, "GOSTARIA DE CADADASTRAR OUTRO CADASTRO? ");
			
		  if (resposta == JOptionPane.YES_OPTION) {
			  cadastraCurriculo();
			  
			 } 
		
		  ArrayList<String> nomesempregados = new ArrayList<>();
			 nomesempregados.add("\nNome: "+nome);
			 nomesempregados.add("\nOcupacao: "+ocupacao+"\n");
		  
			
			 JOptionPane.showMessageDialog(null,"OS CADASTROS SÃO: "+nomesempregados);
			 
		  return nomesempregados;
		  
		  
	}
}
