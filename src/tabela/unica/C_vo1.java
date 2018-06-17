package tabela.unica;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "c")
@DiscriminatorValue("C_vo1")
public class C_vo1 extends A_vo1{
	
	@Column(nullable=false)
	private int y;
	
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
