import java.util.*;
public class Main{
  public static void main(String[] args){
	//LinkedList<Person> persons;// = new ArrayList<>();
    /*
    persons.add(new Person("Bob", "bob@email.com"));
    persons.add(new Person("Ben", "ben@email.com"));
    persons.add(new Person("Pam", "pam@email.com"));
    persons.add(new Person("Eve", "eve@email.com"));
    persons.add(new Person("Guy", "guy@email.com"));
    persons.add(new Person("Lis", "lis@email.com"));
    persons.add(new Person("Ann", "ann@email.com"));
    System.out.println(persons);
    Storage.save(persons);
    */
    //persons=Storage.fetchPersons();
   // System.out.println(persons);
	  
	  
	 Employee martin = new Employee("Martin", "FireMan", new Role("Manager"));
	 martin.addRole(new Role("CEO"));
	 Employee felix = new Employee("Felix", "FireMan", new Role("Part-timer"));
	 
	 System.out.println(martin.toString());
	 System.out.println(felix.toString());
	 
	 martin.removeRole(new Role("Manager"));
	 System.out.println(martin.toString());
	  
	 Person tomas = new Person("Jeff", "@jeffrey.live.se");
	 Person tomas2 = new Person("TommasBigMan");
	 Person tomas3 = new Person(null, "@ReallyAwesomeMail", "07201234");
	 
  }
}
