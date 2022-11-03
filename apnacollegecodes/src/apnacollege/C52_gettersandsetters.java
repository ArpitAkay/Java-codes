package apnacollege;
//getters and setters

class Info {
	public String name;
	protected String email;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

public class C52_gettersandsetters {
	public static void main(String args[]) {
		Info i = new Info();
		i.setPassword("arpit12345");
		System.out.println(i.getPassword());
	}
}