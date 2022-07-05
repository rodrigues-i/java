package me.teste.basico;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import me.modelo.basico.Usuario;

public class AlterarUsuario1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 5L);
		usuario.setNome("Carlinhos");
		usuario.setEmail("carlinhos@lanche.com");

		em.merge(usuario);

		em.getTransaction().commit();

		em.close();

		emf.close();
	}
}