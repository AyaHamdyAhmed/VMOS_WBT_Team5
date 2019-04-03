package vehicle.app;

public class State {

	public static int validate_call_times = 0;
	public static int validate_call_number = 0;
	
	public Boolean bValidateFailure()
	{
		validate_call_times++ ;
		validate_call_number=1;
		return true;
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

	public void vidGoToNextState()
	{
	
	}
}
 
		
	
