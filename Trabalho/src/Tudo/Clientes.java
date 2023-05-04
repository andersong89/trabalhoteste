package Tudo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Clientes {

	
	int cont=0;
	
	
	ArrayList<String> cadastraCurriculo( ) {
	
	
		String nome=JOptionPane.showInputDialog("Qual é o seu nome? ");
		
		int resposta;
		  resposta = JOptionPane.showConfirmDialog(null, "GOSTARIA DE CADADASTRAR OUTRO NOME? ");
			
		  if (resposta == JOptionPane.YES_OPTION) {
			  cadastraCurriculo();
			  
			 } 
		
		  ArrayList<String> nomesempregados = new ArrayList<>();
			 nomesempregados.add(nome);
		  
			
			 JOptionPane.showMessageDialog(null,"OS NOMES CADASTRADOS SÃO: "+nomesempregados);
			 
		  return nomesempregados;
		  
		  
	}
}
