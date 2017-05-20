package top.lc951.state1;

public class GreenState extends State {

	@Override
	public void handlepush(Context c) {
		// TODO Auto-generated method stub
		c.setState(new BlackState());

	}

	@Override
	public void handlepull(Context c) {
		// TODO Auto-generated method stub
		c.setState(new BlueState());

	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "red";
	}

}
