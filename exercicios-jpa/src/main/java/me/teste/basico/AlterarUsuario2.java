package me.teste.basico;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import me.modelo.basico.Usuario;

public class AlterarUsuario2 {
	/*
	 Aqui está em estado gerenciável, ou seja, qualquer mudança feita no objeto
	 Será reflita no banco, sem precisar usar o método merge
	*/
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();


		Usuario usuario = em.find(Usuario.class, 5L);
		usuario.setNome("Carlinhos");

		// em.merge(usuario);
		em.getTransaction().begin();

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}