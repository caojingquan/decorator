package decorator;
/**
 * 感觉这个起始的装饰者不用实现这个借口
 * @author Administrator
 *
 */
public class SalaDecorator implements Sala{
	private Sala sala;
	
	public SalaDecorator(Sala sala){
		this.sala = sala;
	}
	
	public String getContent() {
		return sala.getContent();
	}

	public int getPrice() {
		return sala.getPrice();
	}
	
}
