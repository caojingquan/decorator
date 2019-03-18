package decorator;

public class AppleDecorator extends SalaDecorator{
	
	public AppleDecorator(Sala sala){
		super(sala);
	}

	@Override
	public String getContent() {
		return super.getContent()+"+一个苹果";
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 2;
	}
	
	
	

}
