package Tudo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Clientes {

	String cadastraCurriculo( ) {
		
		String nome=JOptionPane.showInputDialog("Qual é o seu nome? ");
		String resposta=JOptionPane.showInputDialog("GOSTARIA DE CADADASTRAR OUTRO NOME? \n1-sim\n2-nao ");
		
		return nome;
		
	}
	
}
