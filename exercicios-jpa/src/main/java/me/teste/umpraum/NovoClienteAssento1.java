package me.teste.umpraum;

import me.infra.DAO;
import me.modelo.umpraum.Assento;
import me.modelo.umpraum.Cliente;

public class NovoClienteAssento1 {
	public static void main(String[] args) {
		Assento assento = new Assento("8F");
		Cliente cliente = new Cliente("Ana", assento);

		DAO<Object> dao = new DAO<>();

		dao.abrirTransacao()
			.incluir(cliente)
			.incluir(assento)
			.fecharTransacao()
			.fecharDAO();
	}
}