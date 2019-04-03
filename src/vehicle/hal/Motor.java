package vehicle.hal;

public class Motor {
	public static int motorCall=0;
	public static int motorState=0;
	
public static void vidOutput(int state) {
		motorCall++;
		motorState=state;
		LCD.SequenceNumber=2;
		
	}
}
