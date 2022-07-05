package me.teste.basico;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import me.modelo.basico.Usuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		// consutar entidade
		String jpql = "select u from Usuario u";

		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);

		List<Usuario> usuarios = query.getResultList();

		for(Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId() + " E-MAIL: " + usuario.getEmail());
		}

		em.close();

		emf.close();
	}
}