package br.com.fiap.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Forum;
import br.com.fiap.entity.Usuario;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Aula3_JPA");
		
		EntityManager em = entityManagerFactory.createEntityManager();
		
		ForumHelper fHelper = new ForumHelper(em);
		
		Forum f = new Forum();
		f.setAssunto("TESTE");
		f.setDescricao("Teste 1234");
		
		System.out.println(fHelper.salvar(f));
		
		Usuario u1 = new Usuario();
		u1.setForum(f);
		u1.setNome("Diogo");
		u1.setEmail("diogobrito2000@yahoo.com.br");
		
		fHelper.adicionarUsuario(f.getId(), u1);
		
	}

}
