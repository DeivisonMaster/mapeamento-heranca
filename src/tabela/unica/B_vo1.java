package tabela.unica;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "b")
@DiscriminatorValue("B_vo1")
public class B_vo1 extends A_vo1{
	
	@Column(nullable=false)
	private int x;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}
