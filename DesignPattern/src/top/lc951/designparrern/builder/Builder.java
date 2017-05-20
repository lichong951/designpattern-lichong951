package top.lc951.designparrern.builder;

//Person对象的构造接口 
public interface Builder {
	void buildHead();
	void buildBody();
	void buildFoot();
	
	Person buildPerson();
}
