package package1;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Learner theLearner = new Learner("Tariq", "Pune", 78);
			
		Learner secondLearner = new Learner("Chaithanya", "Pune", 67);
		
		
		System.out.println(theLearner.getName() + ", " + theLearner.getId() + ", location : " + theLearner.getLocation());
		System.out.println(secondLearner.getName());

	}

}
//Data Transfer Objects : DTO's
class Learner{
	private String name;
	private int id;
	private String location;
	
	public Learner() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Learner(String name, String location, int id) {
		super();
		this.name = name;
		this.id = id;
		this.location = location;
	}
		


}
