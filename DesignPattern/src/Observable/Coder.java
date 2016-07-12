package Observable;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {
	private final static String TAG = Coder.class.getName();
	public String name;
	
	public Coder(String name){
		this.name=name;
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Hi,"+name+",Dev update data ");
		
	}
	
	public String toString(){
		return "码农 "+name;
	}

}
