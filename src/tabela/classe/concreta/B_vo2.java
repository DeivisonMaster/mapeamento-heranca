package tabela.classe.concreta;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "b")
public class B_vo2 extends A_vo2{
	
	@Column(nullable=false)
	private int x;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}
