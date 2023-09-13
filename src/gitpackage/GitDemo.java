package gitpackage;

public class GitDemo {
	String user="admin@gmail.com";
	String pass="Admin@123";
	void login () {
		if (user.equals("admin@gmail.com") && pass.equals("Admin@123")){
			System.out.println("login success");
			System.out.println("This is micro learning...................................................................");
		}
	}
	void add() {
		System.out.println("Hello World");
	}
	
	
	public static void main(String[] args) {
	
		GitDemo g= new GitDemo();
		g.login();
		
	}
}
