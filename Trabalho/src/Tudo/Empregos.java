package Tudo;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Empregos {
	
	 public static void main(String args[]) {
		
		 String topnome ;
		
		 Clientes a = new Clientes();
		 topnome=a.cadastraCurriculo();
		 ArrayList<String> nomesempregados = new ArrayList<>();
		 nomesempregados.add(topnome);
		 JOptionPane.showMessageDialog(null,"nome do usuario foi: "+ topnome);
		 System.out.println(nomesempregados);
		 
		 
 
}
		
		 
		 
	
}
