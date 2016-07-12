package state;

public class Test {

	public static void main(String[] args) {
		TvController tvController=new TvController();
		tvController.powerOn();
		tvController.nextChannel();
		tvController.turnUp();
		tvController.powerOff();
		tvController.turnUp();
	}

}
