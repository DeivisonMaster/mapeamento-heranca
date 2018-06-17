package tabela.subclasse;

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
 * MAPEAMENTO DE HERAN�A
 * 
 * - Tabela por Subclasse = cada subclasse tem sua propria tabela
 *   Vantagens: 
 * - � normalizada
 * - sem redundancia de dados
 * 
 *   Desvantagens:
 * - desempenho menor que strategia simples
 * 
 * */
@Entity
@Table(name = "a")
@Inheritance(strategy=InheritanceType.JOINED)
public class A_vo3 {
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
