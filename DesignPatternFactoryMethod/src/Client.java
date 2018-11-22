
public class Client
{
	public static void main(String[] args)
	{
		Factory creator = new ConcreteFactory();
		creator.anOperation();
	}
}
