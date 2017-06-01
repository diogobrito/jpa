package br.com.fiap.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Forum;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Aula3_JPA");
		
		EntityManager em = entityManagerFactory.createEntityManager();
		
		ForumHelper fHelper = new ForumHelper(em);
		
		Forum f = new Forum();
		f.setAssunto("JDBC");
		f.setDescricao("Teste JDBC.");
		
		System.out.println(fHelper.salvar(f));
	}

}
