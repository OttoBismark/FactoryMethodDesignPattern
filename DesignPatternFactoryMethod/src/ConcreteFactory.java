
public class ConcreteFactory extends Factory
{
	@Override
	protected Product factoryMethod() {
		return new ConcreteProduct();
	}
}
