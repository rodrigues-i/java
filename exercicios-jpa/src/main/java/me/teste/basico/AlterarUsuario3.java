package me.teste.basico;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import me.modelo.basico.Usuario;

public class AlterarUsuario3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 5L);
		// Usa-se o método 'detach' para sair do estado gerenciável
		em.detach(usuario);

		usuario.setNome("novoNome");

		// o metodo merge faz torna o estado não gerenciável em gerenciável
		em.merge(usuario);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}