package entities;

public class Exercicio3Class {
	
	private String name;
	private int age;
	private double height;
//constructor
	public Exercicio3Class(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
//set/get
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	

}
