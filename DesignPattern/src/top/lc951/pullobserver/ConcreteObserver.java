package top.lc951.pullobserver;


public class ConcreteObserver implements Observer {

	private String observerState;
	

	@Override
	public void update(top.lc951.pullobserver.Subject subject) {
		this.observerState=((ConcreteSubject)subject).getState();
		System.out.println(" "+observerState);		
	}

}
