package strategy;

public class BusStrategy implements CalculateStrategy {

	@Override
	public int calculatePrice(int km) {
		int extraTotal=km-10;
		int extrFactor=extraTotal/5;
		int fraction=extraTotal%5;
		int price=1+extrFactor*1;
		return fraction>0?++price:price;
	}

}
