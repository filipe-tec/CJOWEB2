import java.util.ArrayList;
import java.util.List;

public class PeopleManager {
	
	// uma interface
	private List<Person> peopleList;
	
	public PeopleManager() {
		peopleList = new ArrayList<>();
	}
	
	public List<Person> getPeopleList(){
		return peopleList;
	}
	
	// adicionar uma pessoa a lista e o add adiciona a pessoa a lista
	public boolean save(Person person) {
		if(person!= null) {
			peopleList.add(person);
			return true;
		}
		return false;
	}
	
	public Person search(String cpf) {
		for(Person person: peopleList) {
			if(person.getCpf().equals(cpf)) {
				return person;
			}
		}
		return null;
	}
	
	public boolean update(String cpf, String newName) {
		Person person = search(cpf);
		if(person != null) {
			int i = peopleList.indexOf(person);
			if(i != -1) {
				person.setName(newName);
				peopleList.set(i, person);
				return true;
			}
		}
		return false;
	}
	
	public boolean remove(String cpf) {
		Person person = search(cpf);
		if(person != null) {
			peopleList.remove(person);
			return true;
		}
		return false;
	}
	
}
