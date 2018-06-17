package tabela.unica;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/*
 * MAPEAMENTO DE HERANÇA
 * 
 * - tabela unica
 *   Vantagens: 
 * - simplicidade na implementação
 * - melhor estrategia para performance
 * 
 *   Desvantagens:
 * - sem normalização 
 * - todas propriedades de subclasses permitam valores nulos
 * 
 * */
@Entity
@Table(name = "a")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="distriminador", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("A_vo1")
public class A_vo1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(length=40, nullable=false)
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
