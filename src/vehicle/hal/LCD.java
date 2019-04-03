package vehicle.hal;

public class LCD {
	
	public static int lcdcall;
	public static int SequenceNumber = 0;
	public static int lcdState;
	public static void vidOutput(int state) {
		
		lcdcall++;
		lcdState=state;
		SequenceNumber=1;
	}

}
