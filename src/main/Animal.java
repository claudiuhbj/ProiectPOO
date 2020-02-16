package main;

public class Animal {
	
	private String tipAnimal;
	private String culoare;
	private int varsta;
	
	
	//Constructor 1
	public Animal(String tipAnimal) {
		this.tipAnimal=tipAnimal;
	}
	
	//Constructor 2
	public Animal (String tipAnimal, String culoare) {
		this.tipAnimal=tipAnimal;
		this.culoare=culoare;
	}
	
	//Constructor 3
	public Animal (String tipAnimal, String culoare, int varsta) {
		this.tipAnimal=tipAnimal;
		this.culoare=culoare;
		this.varsta=varsta;
	}
	

	
	
	public String gettipAnimal() {
		return tipAnimal;
	}
	
	public void settipAnimal(String tipAnimal) {
		this.tipAnimal = tipAnimal;
	}
	
	public String getculoare() {
		return culoare;
	}
	
	public void setculoare(String culoare) {
		this.culoare=culoare;
	}
	
	public int getvarsta() {
		return varsta;
	}
	
	public void setvarsta(int varsta) {
		this.varsta=varsta;
	}
	

}
