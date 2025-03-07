package VaultAccessManager;
import java.security.SecureRandom;
import java.util.Scanner;
import com.model.User;

public class LogBook {
Scanner s=new Scanner(System.in);
public User register() {
	System.out.println("Enter your Registration ID:");
	int id=s.nextInt();
	System.out.println("Enter your Name:");
	String nm=s.next()+s.nextLine();
	System.out.println("Enter your Age:");
	int age=s.nextInt();
	System.out.println("Enter your Email:");
	String eml=s.next()+s.nextLine();
	String uname=nm+"@LogBook";
	String pass=LogBook.passGen();
	User u1=new User(id,nm,age,eml,uname,pass);
	return u1;
}
public void login (User u) {
	System.out.println("Enter your username: ");
	String unm=s.next();
	if(unm.equals(u.userName)) {
		System.out.println("Enter your password");
		String pass=s.next();
		if(pass.equals(u.password)) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Password Incorrect");
		}
	}else {
		System.out.println("Username incorrect");
	}
}
public void logout() {
	System.out.println("Logged out successfully...!!!!");
	System.exit(0);
	
}
public static String passGen() {
	SecureRandom sr=new SecureRandom();
	String lowerCase="abcdefghijklmnopqrstuvwxyz";
	String upperCase=lowerCase.toUpperCase();
	String splChar="!@#$%^&*";
	String num="0123456789";
	String allChar=lowerCase+upperCase+splChar+num;
	StringBuffer sb=new StringBuffer(8);
	for(int i=0;i<8;i++) {
		sb.append(allChar.charAt(sr.nextInt(allChar.length())));
	}
	String res=sb.toString();
	return res;
}


}
