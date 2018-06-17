package tabela.classe.concreta;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "c")
public class C_vo2 extends A_vo2{
	
	@Column(nullable=false)
	private int y;
	
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
