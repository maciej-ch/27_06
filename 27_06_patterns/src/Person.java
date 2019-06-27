import java.awt.Color;

public class Person {
	private String firstName;
	private String lastName;
	private String middleName;
	private int age;
	private int height;
	private Color  hairColor;
	
	
	private Person() {
	}

	private Person(String firstName, String lastName, String middleName, int age, int height, Color hairColor) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMiddleName(middleName);
		this.age = age;
		this.setHeight(height);
		this.setHairColor(hairColor);
	}





	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		}


	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}





	public Color getHairColor() {
		return hairColor;
	}

	public void setHairColor(Color hairColor) {
		this.hairColor = hairColor;
	}





	public static class PersonBuilder{
		private Person person ;
		
		
		public PersonBuilder() {
			this.person = new Person();
		}
		
		public PersonBuilder setFirstName (String firstName) {
			this.person.firstName=firstName;
			return this;
		}
		
		public PersonBuilder setLastName (String lastName) {
			this.person.lastName=lastName;
			return this;
		}
		
		
		public PersonBuilder setMiddleName (String middleName) {
			this.person.middleName=middleName;
			return this;
		}
		
		
		public PersonBuilder setHeight (int height) {
			this.person.height=height;
			return this;
		}
		public PersonBuilder setAge (int age) {
			this.person.age=age;
			return this;
		}
		
		public Person build() {
			if (this.person.age==0) {
				throw new RuntimeException("Age cant be zero ");
			}
			return this.person;
		}
	}
}
	


