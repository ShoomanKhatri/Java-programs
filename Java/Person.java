
public class Person {
	private String name;
	private double height;
	private int age;
	private boolean tall;
	private float weight;
	
	public String getName() {
		return this.name;       //we can also write name instead of this.name.
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public boolean isTall() {
		return this.tall;
	}
	public void setTall(boolean tall) {
		this.tall=tall;
	}
	
	public float getWeight() {
		return this.weight;
	}
	public void setWeight(float weight) {
		this.weight=weight;
	}
	
}
