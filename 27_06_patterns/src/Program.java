import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		AnimalFactory af = new AnimalFactory();
		AnimalFactory ab = new AnimalFactory();
		Animal a = af.createAnimal("DOG", "Kanwar");
		Animal b = af.createAnimal("HorsE", "Jolly");


		
		
		
	String[] types= {"dog","horse","cat","horse","cat","horse","duck","lion","cat","horse","duck","lion"};
	String[] names= {"Juli","Eva","OLI", "Tor","Jerry","Eva","Juli","Eva","OLI", "Tor","Jerry","Eva"};
		
	Animal c = af.createAnimal(types[(int)(Math.random()*types.length)] , names[(int) (Math.random()*names.length) ]) ;
	
	System.out.println(a + " "+ a.getName());
	System.out.println(b);
	System.out.println(c);
	System.out.println("__________________________________________________________");
	
	ArrayList<Animal> arr = new ArrayList<>();
	
	for ( int i=0; i<types.length ; i++) {
	 arr.add(ab.createAnimal(types[i] , names[i]) ) ;
	 System.out.print(i+1 + " " );
	}
	System.out.println("\n" + "__________________________________________________________");
	
	for (int i=0;i<arr.size();i++) {
	System.out.println(arr.get(i).getName() + " " +  arr.get(i).getLegs() + " " + arr.get(i).getClass() + " " + arr.get(i).makeNoise());
//	System.out.println(arr.get(i) );
	}
	System.out.println(arr );
	System.out.println(arr.size() );
	

	}
	
}
