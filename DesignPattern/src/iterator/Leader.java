package iterator;

public abstract class Leader {

	protected Leader mNextHandler;
	
	public final void handleRequest(int money){
		if(money<=limit()){
			handle(money);
		}else{
			if(null!=mNextHandler){
				mNextHandler.handleRequest(money);
			}
		}
	}
	
	public abstract int limit();
	
	public abstract void handle(int money);
}
