package ex12inheritance;

public class Dog extends Animal {

	public String dogKind;
	public String name;
	
	public Dog(String species, int age, String gender, String dogKind, String name) {
		super(species, age, gender);
		this.dogKind =dogKind;
		this.name = name;
	}
	
	public void bark( ) {
		   System.out.println("이름이 " + name + "이고 종(포유류)이 " 
				   + getSpecies() + "인 강아지가 짖는다.");
	}
	 public void showDog() {
	        System.out.println("강아지의 종류: " + dogKind);
	        System.out.println("이름: " + name);
	        System.out.println("동물의 종류: " + getSpecies());
	        System.out.println("나이: " + age);
	        System.out.println("성별: " + gender);
	    
	}

}
