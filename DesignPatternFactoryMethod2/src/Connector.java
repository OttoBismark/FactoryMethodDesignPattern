
public class Connector implements MapElement{

	private String connector;
	Place place1, place2;
	
	@Override
	public void setLabel(String id) {
		connector = id;
	}
	
	public void setPlacesConnected(Place origin, Place destination)
	{
		place1 = origin;
		place2 = destination;
	}

	@Override
	public String getPaintingData() {
		return connector + "[from " + 
				place1.getPaintingData() + " to " + 
				place2.getPaintingData();
	}

	
}
