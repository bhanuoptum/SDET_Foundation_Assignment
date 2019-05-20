package assignment_Question3;

public class SuperClass_Cycle {

	    // the Bicycle class has two fields 
	    public int gear; 
	    public int speed; 
	          
	    // the Bicycle class has one constructor 
	    public SuperClass_Cycle(int gear, int speed) 
	    { 
	        this.gear = gear; 
	        this.speed = speed; 
	    } 
	          
	    // the Bicycle class has three methods 
	    protected int applyBrake(int decrement) 
	    { 
	        speed -= decrement; 
	        return speed;
	    } 
	          
	    public void speedUp(int increment) 
	    { 
	        speed += increment; 
	    } 
	      
	    // toString() method to print info of Bicycle 
	    public String toString()  
	    { 
	        return("No of gears are "+gear 
	                +"\n"
	                + "Speed of bicycle is "+speed); 
	    }  
	} 

		 


