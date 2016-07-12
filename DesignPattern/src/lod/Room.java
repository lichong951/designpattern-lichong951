package lod;

public class Room {
	public float area;
	public float price;
	
	public Room(float area,float price){
		this.area=area;
		this.price=price;
	}
	
	public String toString(){
		return "Room [area="+ area +", price=" + price+"]";
	}
}
