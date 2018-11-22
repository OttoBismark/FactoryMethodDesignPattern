import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		ConnectorHandler cToll = new ConnectorHandler();
		PlaceHandler pToll = new PlaceHandler();
		
		Place start, end;
		Connector route;
		
		System.out.println("1st place creation");
		start = (Place) pToll.createElement();
		System.out.println("2nd place creation");
		end = (Place)pToll.createElement();
		
		System.out.println("Connector create");
		route = (Connector) cToll.createElement();
		
		cToll.connect(route, start, end);
		
		pToll.paintElement(start);
		pToll.paintElement(end);
		pToll.paintElement(route);
	}

}
