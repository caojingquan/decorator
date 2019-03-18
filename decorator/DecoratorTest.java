package decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Sala sala = new BaseSala();
		AppleDecorator appleDecorator = new AppleDecorator(sala);
		System.out.println(appleDecorator.getContent()+":"+appleDecorator.getPrice());
		appleDecorator = new AppleDecorator(appleDecorator);
		System.out.println(appleDecorator.getContent()+":"+appleDecorator.getPrice());
	
	}

}
