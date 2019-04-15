
import java.util.Scanner;

public class Student extends User {

	private User UserInformation;
	private Room RentedRoom;
	private Date  interviewSchdule;
	private int school_id;
	private boolean Status;
	 PaymentSystem Paymentinformation;
	
	
	public Student() {
		 super();
		 Room RoomForrent= new Room();
		 Date  interviewSchdule = new  Date();
		 school_id =0;
		 Status = false;
	}
	
	public Student(long userId, String firstName, String lastName, String username, String password, int school_id, boolean status,int day,int month,int year,int roomid, Renter renterid, Address roomAddess, boolean roomstaus) {
		super( userId, firstName, lastName, username, password);
		this.school_id = school_id;
		Status = status;
		Date interviewSchdule = new Date(day,month,year);
		Room RentedRoom = new Room(roomid,renterid, roomAddess ,roomstaus);
	}
	public User getUserInformation() {
		return UserInformation;
	}
	public void setUserInformation(User userInformation) {
		UserInformation = userInformation;
	}
	public Room getRentedRoom() {
		return RentedRoom;
	}
	public void setRentedRoom(Room rentedRoom) {
		RentedRoom = rentedRoom;
	}
	public Date getInterviewSchdule() {
		return interviewSchdule;
	}
	public void setInterviewSchdule(Date interviewSchdule) {
		this.interviewSchdule = interviewSchdule;
	}
	public int getSchool_id() {
		return school_id;
	}
	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	
	public void View_room() {
		RentedRoom.display();
	}
	public void Create_profile() {
		System.out.print("Welcome Student!!!!!\n");
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Create your profile now");
		System.out.println("Enter the following information/n");
		System.out.println("Enter school id");
		setSchool_id(scan.nextInt());
		setStatus(true);
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
		super.display();
		System.out.print("Student information:"+school_id+Status);
		RentedRoom.display();
		interviewSchdule.display();
		
	}
}
