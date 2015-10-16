import lejos.nxt.*;
import lejos.robotics.*;
import lejos.util.*;

public class SensorProgram {

	public static void main(String[] args) {
		SensorPort.S1.addSensorPortListener(new SensorPortListener(){
			public void stateChanged(SensorPort source, int oldValue, int newValue)
			
			{
				if(newValue < 1300){
			
				
				}
				else{
				}
			}
		});
	}
}