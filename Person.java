
public class Person {
	private String name;
	private String phone;
	private String email;

	
	public Person(String name) {
		this(name, "", "");
	}

	public Person(String name, String email) {
		this(name, email, "");
	}

	public Person(String name, String email, String phone) throws NullPointerException  {
		if(name == null) {
			throw new NullPointerException("Book title cant be null");
		}
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String name() {
		return name;
	}

	public String email() {
		return email;
	}

	public String phone() {
		return phone;
	}

	@Override
	public String toString() {
		return String.format("%s  %s  %s", name, (email == null ? "" : email), (phone == null ? "" : phone));
	}
}