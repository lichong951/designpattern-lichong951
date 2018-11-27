package top.lc951.create.build;

public abstract class Burger implements Item {

	

	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}
	@Override
	public abstract float price();
	

}
