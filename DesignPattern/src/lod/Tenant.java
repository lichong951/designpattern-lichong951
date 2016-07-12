package lod;

import java.util.List;

public class Tenant {
	public float roomArea;
	public float roomPrice;
	public static final float diffPrice = 100.001f;
	public static final float diffArea = 0.0001f;

	public void rentRoom(Mediator mediator) {
		mediator.rentOut(roomArea, roomPrice);

		
	}

}
