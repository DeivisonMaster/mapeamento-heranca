package tabela.subclasse;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "c")
@PrimaryKeyJoinColumn(name = "codigoA")
public class C_vo3 extends A_vo3{
	
	@Column(nullable=false)
	private int y;
	
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
