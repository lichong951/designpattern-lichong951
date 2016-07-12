package iterator;

public class Boss extends Leader {

	@Override
	public int limit() {
		// TODO Auto-generated method stub
		return Integer.MAX_VALUE;
	}

	@Override
	public void handle(int money) {
		System.out.println("total:"+money+" ");
	}

}
