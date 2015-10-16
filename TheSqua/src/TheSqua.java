import lejos.nxt.*;
import lejos.robotics.*;
import lejos.util.*;

public class TheSqua {
	public static void main (String[] args) { 
	Button.waitForAnyPress();
	  TouchSensor touch = new TouchSensor(SensorPort.S3); 
	 
	int x = 0;
	while(x <100){
	  
	while(!touch.isPressed());{
	DifferentialPilot pilot = new DifferentialPilot(2.1f, 4.4f, Motor.B, Motor.C);  // parameters in inches
		// Set speed to 10
		pilot.setTravelSpeed(10); 
		// Move foward 
		pilot.travel(12);       
		// Exit when button is pressed
		Button.waitForPress();
	}
		if (touch.isPressed()) {
			pilot.travel(-12);
			pilot.rotate (90);
			pilot.travel(12);
		}

	 x++; 
	  }
	}
	}



