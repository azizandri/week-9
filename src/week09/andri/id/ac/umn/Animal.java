package week09.andri.id.ac.umn;

public interface Animal {
	public void eat();
	public void travel();
}

public class Mammal implements Animal{

	public Mammal() {}
	
	@Override
	public void eat() {
		System.out.println("Mammal eats");
	}

	@Override
	public void travel() {
		System.out.println("Mammal travel");
		
	}
	
	public static void main(String[] args) {
		Mammal m = new Mammal();
		m.eat();
		m.travel();
	};
	
}
