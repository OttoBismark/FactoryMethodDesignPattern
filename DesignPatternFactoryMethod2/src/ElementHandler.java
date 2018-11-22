import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class ElementHandler {

	public MapElement createElement() throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String label = reader.readLine();
		
		MapElement element = newElement();
		
		element.setLabel(label);
		
		return element;
	}
	
	public abstract MapElement newElement();
	
	public void paintElement(MapElement element)
	{
		System.out.println(element.getPaintingData());
	}
}
