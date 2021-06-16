import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		/* Syntax
		 * ArrayList<T> is a collection that can work with various classes.
		 * ArrayList<Double>
		 * ArrayList<Integer>
		 * ArrayList<Integer> integers;
		 * ArrayList<Double> marks;
		 * */
		ArrayList<Double> newMarks = new ArrayList<Double>();
		newMarks.add(65.3);
		newMarks.add(78.4);
		newMarks.add(1,84.5);
		
		for(int i = 0;i<newMarks.size();i++) {
			System.out.printf("%f%n", newMarks.get(i));
		}
		System.out.printf("%s%n",newMarks); //A simpler way to output an ArrayList
		newMarks.remove(65.3); //Remove the value 65.3
		System.out.printf("%s%n",newMarks);
		newMarks.remove(0); //Remove the first value
		System.out.printf("%s%n",newMarks);
		
		//Array list can take on other types of objects (e.g. Strings)
		ArrayList<String> unitNames = new ArrayList<String>();
		unitNames.add("Electromagnetics II");
		unitNames.add("Calculus V");
		unitNames.add("Computer Programming III");
		for(int i = 0;i<unitNames.size();i++) {
			System.out.printf("%n%s", unitNames.get(i));
		}

	}

}
