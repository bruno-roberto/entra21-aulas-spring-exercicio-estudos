package br.com.entra21.spring.exercicio.estudos.Exercitando.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import br.com.entra21.spring.exercicio.estudos.Exercitando.model.Exemplo;



@Repository
@EnableJpaRepositories
public interface IExemploRepository extends JpaRepository<Exemplo, Integer> {

	public List<Exemplo> findByAge(Integer age);
	
	public List<Exemplo> findByFirstNameAndAge(String firstName, Integer age);
	
	public List<Exemplo> findByAgeLessThanEqual(Integer age);
	
	public List<Exemplo> findByLastNameStartingWith(String prefixo);
}