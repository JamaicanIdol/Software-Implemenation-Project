
public class Address {
	
		private String lineOne;
		private String LineTwo;
		private String Town;
		private String Parish;
		
		public Address(){
			lineOne ="";
			 LineTwo="";
			   Town="";
		      Parish="";
			
		}
		public Address(String lineOne ,String LineTwo, String Town, String Parish){
			this.lineOne =lineOne;
			 this.LineTwo=LineTwo;
			  this. Town=Town;
		     this. Parish=Parish;
		}
		public String getLineOne() {
			return lineOne;
		}
		public void setLineOne(String lineOne) {
			this.lineOne = lineOne;
		}
		public String getLineTwo() {
			return LineTwo;
		}
		public void setLineTwo(String lineTwo) {
			LineTwo = lineTwo;
		}
		public String getTown() {
			return Town;
		}
		public void setTown(String town) {
			Town = town;
		}
		public String getParish() {
			return Parish;
		}
		public void setParish(String parish) {
			Parish = parish;
		}

		
		public void display() {
			System.out.println("Address:"+lineOne+LineTwo +Town+Parish);
		}
	}


