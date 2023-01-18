import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String department;
	private List<Role> roles = new ArrayList<Role>();

	public Employee(String name, String department, Role initialRole) {
		this.name = name;
		this.department = department;
		this.roles.add(initialRole);
	}

	public String name() {
		return name;
	}

	public String department() {
		return department;
	}

	public List<Role> getRoles() {
		return roles;
	}
	
	public void addRole(Role role) {
		roles.add(role);
	}
	public void removeRole(Role role) {
		for (Role rol : roles) {
			if(rol.getName().equals(role.getName())) {
				roles.remove(rol);
			}
					
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", roles=" + roles + "]";
	}


}
