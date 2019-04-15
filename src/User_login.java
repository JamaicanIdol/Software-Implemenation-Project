import java.util.Scanner;
public class User_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scan = new Scanner(System.in);
	          Renter a = new Renter();
	          Student b = new Student();
	          int num =0;
	          System.out.println("Enter 1 if your a Renter Or Enter 2 for Student");
	           num = scan.nextInt();
	          switch(num) {
	          case 1:
	          a.Create_profile();
	          case 2:
	        	  b.Create_profile();
	          }
	          scan.close();
	}

}