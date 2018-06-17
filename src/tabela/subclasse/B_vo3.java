package tabela.subclasse;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "b")
public class B_vo3 extends A_vo3{
	
	@Column(nullable=false)
	private int x;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}
