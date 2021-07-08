
public class AnimalSounds {

	public static void main(String[] args) {
		Bird bird = new Bird();
		Frog frog = new Frog();
		Fish fish = new Fish();
		
	
		Animal creatures[] = {bird, frog, fish};
		for(Animal a: creatures) {
			a.sound();
		}
		

	}

}
