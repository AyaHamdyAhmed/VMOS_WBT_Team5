package vehicle.app;

public class State {
	
	public static int validate_call_times=0;
	public static int validate_call_bValidateFailure =0;
	public static int validate_call_bValidateLowPerformance =0;
	public static int validate_call_bValidateHighPerformance =0;
	public static int validate_call_bValidateGoToNextState=0;

	public Boolean bValidateFailure()
	{
		validate_call_times++ ;
		validate_call_bValidateFailure=1;
		return true;
	}

	public Boolean bValidateLowPerformance()
	{
		validate_call_times++ ;
		validate_call_bValidateLowPerformance =1;
		return false;
	}
	
	public Boolean bValidateHighPerformance()
	{
		validate_call_times++ ;
		validate_call_bValidateHighPerformance =1;
		return false;
	}

	public void vidGoToNextState() {
	
	}

}


