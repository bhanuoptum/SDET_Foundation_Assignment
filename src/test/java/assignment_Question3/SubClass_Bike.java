package assignment_Question3;

public class SubClass_Bike extends SuperClass_Cycle {
			 		       
		     // the MountainBike subclass adds one more field 
		     public int seatHeight; 
		   
		     // the MountainBike subclass has one constructor 
		     public SubClass_Bike(int gear,int speed, 
		                         int startHeight) 
		     { 
		         // invoking base-class(SuperClass_Bicycle) constructor 
		         super(gear, speed); 
		         seatHeight = startHeight; 
		     }  
		           
		    // overriding toString() method 
		     // of Bicycle to print more info 
		     @Override
		     public String toString() 
		     { 
		         return (super.toString()+ 
		                 "\nSeat height is "+seatHeight); 
		     } 
		     
		     protected int applyBrake(int decrement) 
			    { 
			        speed -= decrement;
			        return speed;
			    } 
		       
		 } 

		