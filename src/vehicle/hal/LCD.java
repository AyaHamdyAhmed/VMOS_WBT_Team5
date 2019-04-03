package vehicle.hal;

public class LCD {
	
<<<<<<< HEAD
	public static int lcdcall;
	public static int SequenceNumber = 0;
	public static int lcdState;
=======
	public static int lcdcall=0;
	public static int SequenceNumber=0;
	public static int lcdState=0;
>>>>>>> master
	public static void vidOutput(int state) {
		
		lcdcall++;
		lcdState=state;
		SequenceNumber=1;
	}

}
