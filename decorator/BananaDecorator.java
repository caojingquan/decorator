package decorator;

public class BananaDecorator extends SalaDecorator{

	public BananaDecorator(Sala sala) {
		super(sala);
	}

	@Override
	public String getContent() {
		return super.getContent()+"+一个香蕉";
	}

	@Override
	public int getPrice() {
		return super.getPrice()+3;
	}

}
