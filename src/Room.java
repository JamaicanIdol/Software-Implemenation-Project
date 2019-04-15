
public class Room {

	private int Roomid;
	private Renter Renterid ;
	private Address RoomAddress;
	private boolean Roomstaus;
	public Room() {
		Roomid = 0;
		Roomstaus = false;
		Address RoomAddress =new Address();
	}
	
	public Room(int roomid, Renter renterid, Address roomAddess, boolean roomstaus) {
		
		Roomid = roomid;
		Renterid = renterid;
		RoomAddress = roomAddess;
		Roomstaus = roomstaus;
	}
	
	
	public Room(int roomid, Renter renterid, Address roomAddess, boolean roomstaus,String lineOne ,String LineTwo, String Town, String Parish) {
		Address RoomAddress =new Address( lineOne ,LineTwo, Town, Parish);
		
		Roomid = roomid;
		Renterid = renterid;
		RoomAddress = roomAddess;
		Roomstaus = roomstaus;
	}
	public int getRoomid() {
		return Roomid;
	}
	public void setRoomid(int roomid) {
		Roomid = roomid;
	}
	public Renter getRenterid() {
		return Renterid;
	}
	public void setRenterid(Renter renterid) {
		Renterid = renterid;
	}
	public Address getRoomAddess() {
		return RoomAddress;
	}
	public void setRoomAddess(Address roomAddess) {
		RoomAddress = roomAddess;
	}
	public boolean isRoomstaus() {
		return Roomstaus;
	}
	public void setRoomstaus(boolean roomstaus) {
		Roomstaus = roomstaus;
	}
	public void display() {
		System.out.print("ROOM Information:"+Roomid+Roomstaus);
		RoomAddress.display();
		Renterid.display();
	}
}
