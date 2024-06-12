package BusResv;

public class Bus {

	int busNo;
	boolean ac;
	int capacity;
	
	Bus(int no,boolean ac,int cap){
	this.busNo = no;
	this.ac = ac;
	this.capacity = cap;
	}
	public int getBusNo() {
		return busNo;
	}
	public int getcapacity() {
		return capacity;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean val) {
		ac = val;
	}
	public void setcapacity(int cap) {
		capacity = cap;
	}
	public void displayBusInfo() {
		System.out.println("BusNo:" + busNo + "Ac:" + ac + " Total capacity:" + capacity);
	}
}
