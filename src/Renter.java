
import java.util.Scanner;

public class Renter extends User {

	private User UserInformation;
	private Room RoomForrent;
	private Date  interviewSchdule;
	private  PaymentSystem Paymentinformation;
	public Renter () {
		 super();
		 Room RoomForrent= new Room();
		 Date  interviewSchdule = new  Date();
	}
	
	
	public Renter(long userId, String firstName, String lastName, String username, String password,int day,int month,int year,int roomid, Renter renterid, Address roomAddess, boolean roomstaus) {
		super( userId, firstName, lastName, username, password);
				Date interviewSchdule = new Date(day,month,year);
				Room RentedRoom = new Room(roomid,renterid, roomAddess ,roomstaus);
		
	}
	public User getUserInformation() {
		return UserInformation;
	}
	public void setUserInformation(User userInformation) {
		UserInformation = userInformation;
	}
	public Room getRoomForrent() {
		return RoomForrent;
	}
	public void setRoomForrent(Room roomForrent) {
		RoomForrent = roomForrent;
	}
	public Date getInterviewSchdule() {
		return interviewSchdule;
	}
	public void setInterviewSchdule(Date interviewSchdule) {
		this.interviewSchdule = interviewSchdule;
	}
	public void Create_profile() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Welcome Renter Create your profile now");
		System.out.println("Enter the following information/n");
		System.out.println("Enter User Id:\t\n");
		setUserId(scan.nextLong());
		System.out.println("Enter first name:\t\n");
		 setFirstName(scan.next());
		System.out.println("Enter last name:\t\n");
		setLastName(scan.next());
		System.out.println("Enter Username:\t\n");
		setUsername(scan.next());
		System.out.println("Enter password that you can remember:\t\n");
		setPassword(scan.next());
		
		System.out.println("Now Ener Payment information\n");
		System.out.println("Account number:\t");
	      long num= scan.nextLong();
		System.out.println("Payment Type:\t\n");
		String payment = scan.next();
		System.out.println("Transaction number:\t\n");
		long num1= scan.nextLong();
		System.out.println("Transaction amount$:\t\n");
		float num3 = scan.nextFloat();
		
		 PaymentSystem Paymentinformation = new  PaymentSystem(num,payment,num1,num3);
	
		System.out.println("Now Enter Interview Schdule \n");
		System.out.println("month day year:\t\n");
		int m = scan.nextInt();
		int d = scan.nextInt();
		int y = scan.nextInt();
		Date interviewSchdule = new Date (d,m,y);
		
		scan.close();
	};
	
	public void display() {
		System.out.print("Renter information:");
		UserInformation.display();
		RoomForrent.display();
		interviewSchdule.display();
		 Paymentinformation.display();
	}


	public PaymentSystem getPaymentinformation() {
		return Paymentinformation;
	}


	public void setPaymentinformation(PaymentSystem paymentinformation) {
		Paymentinformation = paymentinformation;
	}
}
