
import java.util.Scanner;
public abstract class User {

	protected long UserId;
	protected String FirstName;
	protected String LastName;
	protected String Username;
	protected String password;
	 PaymentSystem Paymentinformation;
	
	public User () {
		UserId=0;
		 FirstName="";
		 LastName="";
		 Username="";
		password="";
	}

	public User(long userId, String firstName, String lastName, String username, String password,long accountNumber, String paymetType, long transactionNumber, float transactionAmount) {
		
		UserId = userId;
		FirstName = firstName;
		LastName = lastName;
		Username = username;
		this.password = password;
		PaymentSystem Paymentinformation = new PaymentSystem( accountNumber, paymetType, transactionNumber, transactionAmount);
	}
	
public User(long userId, String firstName, String lastName, String username, String password) {
		
		UserId = userId;
		FirstName = firstName;
		LastName = lastName;
		Username = username;
		this.password = password;
		
	}

public User(long accountNumber, String paymetType, long transactionNumber, float transactionAmount) {
	PaymentSystem Paymentinformation = new PaymentSystem( accountNumber, paymetType, transactionNumber, transactionAmount);
}

	public long getUserId() {
		return UserId;
	}

	public void setUserId(long userId) {
		UserId = userId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PaymentSystem getPaymentinformation() {
		return Paymentinformation;
	}

	public void setPaymentinformation(PaymentSystem paymentinformation) {
		Paymentinformation = paymentinformation;
	}
	
	public abstract void Create_profile();
	
	public void display() {
	System.out.println("User Information:"+UserId +FirstName+ LastName);
	
	Paymentinformation.display();
	}
}
