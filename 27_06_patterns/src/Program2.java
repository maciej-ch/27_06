public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person.PersonBuilder pb = new Person.PersonBuilder();
		
		pb.setFirstName("Kanwar");
		pb.setLastName("Singh");
		pb.setHeight(160);
		pb.setMiddleName("KANSING");
		pb.setAge(3);
		Person px = pb.build();
		
		//------------------------------------------------------------------
		
		// Variante 2
		
		Person p = new Person.PersonBuilder()
				.setFirstName("Kanwar")
				.setLastName("Singh")
				.setMiddleName("test")
				.setHeight(160)
				.setAge(22)
				.build();

	System.out.println( px + " " + px.getFirstName());
	System.out.println( p  + " " + p.getHeight());
	
	}


	
}