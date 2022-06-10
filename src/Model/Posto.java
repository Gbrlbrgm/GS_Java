package Model;
import java.util.ArrayList;

import Model.Enums.*;

public class Posto {
	private String nome;
	private Endereco endereco;
	private String avaliacao;
	private ArrayList<Plugs> plug;

	private String precoKWH;
	
	public Posto(String nomeC, Endereco enderecoC, String avaliacaoC, ArrayList<Plugs> plugC, String precoKWHC) {
		mudarNome(nomeC);
		mudarEndereco(enderecoC);
		mudarAvaliacao(avaliacaoC);
		mudarPlug(plugC);
		mudarPrecoKWH(precoKWHC);
	}

	public String getNome() {
		return nome;
	}

	public void mudarNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void mudarEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void mudarAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getPlug1() {
		return plug.contains(Plugs.tipo1) ? "Possui" : "Não Possui";
	}
	public String getPlug2() {
		return plug.contains(Plugs.tipo2) ? "Possui" : "Não Possui";
	}
	public String getPlug3() {
		return plug.contains(Plugs.css2) ? "Possui" : "Não Possui";
	}
	public String getPlug4() {
		return plug.contains(Plugs.chademo) ? "Possui" : "Não Possui";
	}

	public void mudarPlug(ArrayList<Plugs> plug) {
		this.plug = plug;
	}

	public String getPrecoKWH() {
		return precoKWH;
	}

	public void mudarPrecoKWH(String precoKWH) {
		this.precoKWH = precoKWH;
	}
	
	public ArrayList<Plugs> getPlug() {
		return plug;
	}
	
}