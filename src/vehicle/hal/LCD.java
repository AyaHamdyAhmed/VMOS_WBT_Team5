package vehicle.hal;

public class LCD {
	
	public static int lcdcall=0;
	public static int SequenceNumber=0;
	public static int lcdState=0;
	public static void vidOutput(int state) {
		
		lcdcall++;
		lcdState=state;
		SequenceNumber=1;
	}

}
