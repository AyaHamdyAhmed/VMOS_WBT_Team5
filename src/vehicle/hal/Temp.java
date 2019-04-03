package vehicle.hal;

public class Temp {
	
	public static int r1;
	public static int r2;
	public static int validateCall1=0;
	public static int validateCall2=0;
	public static int iReadT1()
	{
		validateCall1++;
		return r1;
		
	}
	
	public static int iReadT2()
	{
		validateCall2++;
		return r2;
		
	}

}
