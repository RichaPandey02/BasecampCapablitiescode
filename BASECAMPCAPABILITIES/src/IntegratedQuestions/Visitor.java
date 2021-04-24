package IntegratedQuestions;
public class Visitor {
	private long id;
	private String name;
	private float age;
	private String gender;
	Visitor()
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public Visitor(long id, String name, float age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
