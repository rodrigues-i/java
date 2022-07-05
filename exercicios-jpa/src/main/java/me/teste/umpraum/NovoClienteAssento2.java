package me.teste.umpraum;

import me.infra.DAO;
import me.modelo.umpraum.Assento;
import me.modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
	public static void main(String[] args) {

		Assento assento = new Assento("2D");
		Cliente cliente = new Cliente("Maria", assento);

		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.incluirAtomico(cliente);
	}
}