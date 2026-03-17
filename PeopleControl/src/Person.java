
public class Person {
	
	private String name;
	private String cpf;
	
	public Person(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}
	
	// Setter : modifica o atributo privado
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter : acessa o atributo privado
	public String getName() {
		return name;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	//Isso retira o padrão de exibir os atribustos com um codigo hexadecimal junto, podendo fazer da minha forma.
	@Override
	public String toString() {
		return "Dados da pessoa [Nome: " + name + " - CPF: " + cpf + "]";
	}
}
