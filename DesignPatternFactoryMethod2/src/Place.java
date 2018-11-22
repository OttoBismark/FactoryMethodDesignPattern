
public class Place implements MapElement{

	private String place;
	@Override
	public void setLabel(String id) {
		place = id;
	}

	@Override
	public String getPaintingData() {
		return "city :" + place;
	}

	
}
