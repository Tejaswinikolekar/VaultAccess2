package VaultAccessManager;
import java.util.Scanner;
import com.service.LogBook;
import com.model.User;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LogBook lb=new LogBook();
		User u=null;
		while(true) {
			System.out.println("Welcome to Vault Access.....!!!!");
			System.out.println("1.Register yourself...\n2.Login\n3.Logout");
			System.out.println("Enter your choice:");
			int ch=s.nextInt();
			switch(ch) {
			case 1:
				u=lb.register();
				System.out.println("Registration Completed.....");
				System.out.println("Username:"+u.userName);
				System.out.println("Password:"+u.password);
				System.out.println("You can login now....!!!!!");
				break;
			case 2:
				lb.login(u);
				break;
			case 3:
				lb.logout();
				break;
			default:
				System.out.println("Wrong choice code...");
				break;
			}
		}
	}

}
