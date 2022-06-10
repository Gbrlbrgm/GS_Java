package Controller;
import java.util.ArrayList;

import Model.Posto;

public class RegisterController {
	
	private ArrayList<Posto> postosCadastrados = new ArrayList<Posto>();

	public ArrayList<Posto> getPostosCadastrados() {
		return postosCadastrados;
	}
	
	public void cadastrarPosto(Posto postoNovo) {
		if (postoNovo != null) {
			postosCadastrados.add(postoNovo);
			
			System.out.println("POSTOS CADASTRADOS");
			System.out.println("------------------------");
			for (Posto postoDeGasolina : postosCadastrados) {
				System.out.println(postoDeGasolina.getNome());
			}
			System.out.println("------------------------\n\n\n");
			
		}
	}
	
}