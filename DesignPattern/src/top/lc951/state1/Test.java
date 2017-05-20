package top.lc951.state1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context c=new Context();
		c.setState(new BlueState());
		c.pull();
		c.push();
		
		c.setState(new RedState());
		c.pull();
		c.push();

	}

}
