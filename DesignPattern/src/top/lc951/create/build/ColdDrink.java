package top.lc951.create.build;

public abstract class ColdDrink implements Item {

	

	 
	public Packing packing() {
		return new Bottle();
	}
	@Override
    public abstract float price();

}
