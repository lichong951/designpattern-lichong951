package top.lc951.iterator;

public class XiaoMin {

	public static void main(String[] args) {
		GroupLeader groupLeader=new GroupLeader();
		Director director=new Director();
		Manager manager=new Manager();
		Boss boss=new Boss();
		
		groupLeader.mNextHandler=director;
		director.mNextHandler=manager;
		manager.mNextHandler=boss;
		
		groupLeader.handle(50000);
	}

}
