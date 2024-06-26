package BusResv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {

	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passengerName = sc.next();
	   System.out.println("Enter BusNo: ");
	   busNo = sc.nextInt();
	   System.out.println("Enter date dd-mm-yyyy");
	  String dateInput = sc.next();
	  SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
	
	  try {
		date = dateformat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getBusNo() == busNo)
				capacity = bus.getcapacity();
		}
		int booked = 0;
		for(Booking b:bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
	}
}
