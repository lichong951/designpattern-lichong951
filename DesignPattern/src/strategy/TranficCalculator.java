package strategy;

public class TranficCalculator {

	public static void main(String[] args) {
		TranficCalculator calculator=new TranficCalculator();
		calculator.setmStrategy(new BusStrategy());
		System.out.println("total:"+calculator.calculatePrice(16));
	}
	
	CalculateStrategy mStrategy;

	public CalculateStrategy getmStrategy() {
		return mStrategy;
	}

	public void setmStrategy(CalculateStrategy mStrategy) {
		this.mStrategy = mStrategy;
	}
	
	public int calculatePrice(int km){
		return mStrategy.calculatePrice(km);
	}

}
