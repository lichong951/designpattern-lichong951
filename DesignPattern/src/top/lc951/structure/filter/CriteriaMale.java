package top.lc951.structure.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> malePersons = new ArrayList<Person>(); 
	      for (Person person : persons) {
	         if(person.getGender().equalsIgnoreCase("MALE")){
	            malePersons.add(person);
	         }
	      }
	      return malePersons;
	}

}