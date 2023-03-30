package hello;

public class Greeter {
	public String sayHello() {
		return "Hello world!";
	}



	public int multipliedBytwoResult(int number){
		if(number == 0){
			return 0;
		}
		else{
			return number*2;
		}
	}


	public String fullName(String firstName, String lastName, String midddleName) throws Exception {

		if (firstName==null || lastName==null){
			throw new Exception("Invalid first name and last name exception");
		}

		return firstName+" "+midddleName+" "+lastName;
	}
}
