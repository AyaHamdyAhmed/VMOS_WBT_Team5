package vehicle.hal;

public class LCD {
	
	public static int lcdcall;
	public static int lcdCallNumber = 0;
	public static int lcdState;
	public static void vidOutput(int state) {
		
		lcdcall++;
		lcdState=state;
		lcdCallNumber=1;
	}

}
