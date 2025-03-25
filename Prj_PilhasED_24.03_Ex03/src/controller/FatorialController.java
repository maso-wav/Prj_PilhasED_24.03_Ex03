package controller;

import br.edu.fateczl.pilha.PilhaInt;

public class FatorialController {
	
	public FatorialController() {
		
		super();
	}

	public long calculaFat(int numero) {

		PilhaInt p = new PilhaInt();
		long resultado = 1;
		
		if (numero > 0) {
			while (numero > 0) {
				
				p.push(numero);
				numero--;

			}
		} else {
			
			p.push(numero);
		}
		
		while(p.isEmpty() == false) {
					
			int num;			
			
			try {
				
				num = p.pop();
				resultado = (resultado*num);
				
			} catch (Exception e) {

				e.printStackTrace();
			}			
		}
		
		return resultado;
	}

}
