package top.lc951.designparrern.builder;
//Person对象的整体构造器
public class PersonDirector {

	public Person constructPerson(Builder pb){
		pb.buildBody();
		pb.buildFoot();
		pb.buildHead();
		
		return pb.buildPerson();
	}
}
