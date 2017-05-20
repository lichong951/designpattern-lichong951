package top.lc951.designparrern.builder;


//Person对象的构造器
public class ManBuilder implements Builder{

	Person person;
	
	public ManBuilder(){
		person=new Man();
	}
	
	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("建造男人的头");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("建造男人的身体");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("建造男人的脚");
	}

	@Override
	public Person buildPerson() {
		// TODO Auto-generated method stub
		return person;
	}

	
}
