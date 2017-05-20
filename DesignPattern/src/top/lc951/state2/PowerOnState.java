package top.lc951.state2;
/**开机状态*/
public class PowerOnState implements TvState {

	@Override
	public void nextChannel() {
		System.out.println("nextChannel");

	}

	@Override
	public void prevChannel() {
		System.out.println("prevChannel");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnUp() {
		System.out.println("turnUp");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnDown() {
		System.out.println("turnDown");
		// TODO Auto-generated method stub

	}

}
