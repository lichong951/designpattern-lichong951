package pullobserver;


public class ConcreteObserver implements Observer {

	private String observerState;
	

	@Override
	public void update(pullobserver.Subject subject) {
		this.observerState=((ConcreteSubject)subject).getState();
		System.out.println(" "+observerState);		
	}

}
