
public abstract class Factory
{
	public void anOperation()
	{
		Product product = factoryMethod();
	}
	
	protected abstract Product factoryMethod();
}
