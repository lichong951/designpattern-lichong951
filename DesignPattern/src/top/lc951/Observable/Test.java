package top.lc951.Observable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DevTechFrontier devTechFrontier=new DevTechFrontier();
		
		Coder mrsimple=new Coder("mr.simple");
		Coder coder1=new Coder("coder-1");
		Coder coder2=new Coder("coder-2");
		
		devTechFrontier.addObserver(mrsimple);
		devTechFrontier.addObserver(coder1);
		devTechFrontier.addObserver(coder2);
		
		devTechFrontier.postNewPublication(" newspaper update");
		
	}

}
