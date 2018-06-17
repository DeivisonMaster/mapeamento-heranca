package tabela.classe.concreta;

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
 * - Tabela por Classe concreta = uma tabela por cada classe concreta
 *   Vantagens: 
 * - propriedades de subclasses possuam restrições de não nulo
 * 
 *   Desvantagens:
 * - sem normalização 
 * - menor performace
 * 
 * */
@Entity
@Table(name = "a")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class A_vo2 {
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
