package vehicle.app;

public class State {
<<<<<<< HEAD
	
	public static int validate_call_times=0;
	public static int validate_call_number =0;
	
	public Boolean bValidateFailure()
	{
		validate_call_times++ ;
		validate_call_number=1;
		return true;
=======

	public Boolean bValidateFailure() {
		return false;
>>>>>>> 870dbbd696bbdc574c0fe49bc6967c0b0fe52d68
	}
	
	public Boolean bValidateLowPerformance()
	{
		validate_call_times++ ;
		validate_call_number=2;
		return false;
	}
	
	public Boolean bValidateHighPerformance()
	{
		validate_call_times++ ;
		validate_call_number=3;
		return false;
	}
<<<<<<< HEAD

	public void vidGoToNextState() {
 
		
		
	}
=======
	
	public void vidGoToNextState() {
		
	}
}
>>>>>>> 870dbbd696bbdc574c0fe49bc6967c0b0fe52d68
