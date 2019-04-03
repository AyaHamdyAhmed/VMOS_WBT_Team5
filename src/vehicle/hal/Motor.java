package vehicle.hal;

public class Motor {
	public static int motorCall;
	public static int motorState;
	
public static void vidOutput(int state) {
		motorCall++;
		motorState=state;
		LCD.lcdCallNumber=2;
		
	}
}
