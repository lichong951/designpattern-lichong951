package top.lc951.state1;

public class Context {

	private State state=null;
	public void setState(State state){
		this.state=state;
		
	}
	
	public void push(){
		state.handlepush(this);
		Sample sample=new Sample(state.getColor());
		sample.operate();
	}
	
	public void pull(){
		state.handlepull(this);
		Sample2 sample2=new Sample2(state.getColor());
		sample2.operate();
	}
}
