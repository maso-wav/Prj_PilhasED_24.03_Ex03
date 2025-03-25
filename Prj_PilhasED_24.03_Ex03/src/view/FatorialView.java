package view;

import javax.swing.JOptionPane;
import controller.FatorialController;

public class FatorialView {

	public static void main(String[] args) {
		
		FatorialController fc = new FatorialController();
		int numero = -1;
		
		while(numero < 0 || numero > 10) {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
						
		}

		long fatorial = fc.calculaFat(numero);
		
		JOptionPane.showMessageDialog(null, numero + "! é igual a: " + fatorial + ".");		
	}
}
