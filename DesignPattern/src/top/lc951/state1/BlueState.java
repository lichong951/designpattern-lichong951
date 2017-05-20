package top.lc951.state1;

public class BlueState extends State {

	
	@Override
	public void handlepush(Context c) {
		// TODO Auto-generated method stub
		c.setState(new GreenState());

	}

	@Override
	public void handlepull(Context c) {
		// TODO Auto-generated method stub
		c.setState(new RedState());

	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "blue";

	}

}
