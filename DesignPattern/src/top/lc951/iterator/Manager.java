package top.lc951.iterator;

public class Manager extends Leader {

	@Override
	public int limit() {
		// TODO Auto-generated method stub
		return 10000;
	}

	@Override
	public void handle(int money) {
		System.out.println("total:"+money+" ");
	}

}
