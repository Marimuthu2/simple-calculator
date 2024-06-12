package BusResv;
import java.util.Scanner;
import java.util.ArrayList;	

public class BusDemoo {
	public static void main (String[] args) {
  
		ArrayList<Bus> Buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
		Buses.add(new Bus(1,true,45));
		Buses.add(new Bus(2,false,50));
		Buses.add(new Bus(3,true,48));
		
		int userinput = 1;
		Scanner sc = new Scanner(System.in);
		
		
		for(Bus b: Buses) {
			b.displayBusInfo();
		}
		
		while(userinput == 1) {
			System.out.println("Welcome...  Enter 1 to Book and 2 to exit");
			userinput=sc.nextInt();
		if(userinput == 1) {
		     Booking booking = new Booking();
		    if(booking.isAvailable(bookings,Buses)) {
		    	bookings.add(booking);
		    	System.out.println("Your booking is conformed");
		    }
		    
		    else
		    	System.out.println("sorry. Bus is full. Try Another bus or date");
		}
		
				}
			}

		}


