package vehicle.app;

public class State {
	public static int validate_call_bValidateFailure =0;
	public static int validate_call_bValidateLowPerformance =0;
	public static int validate_call_bValidateHighPerformance =0;
	public static int validate_call_bValidateGoToNextState=0;
	public static int validate_call_number = 0;
	public static int validate_sequence = 0;
	public static int validate_sequence2 = 0;
	public Boolean bValidateFailure()
	{
		validate_call_bValidateFailure++;
		validate_sequence = 1;
		validate_sequence2 = 1;
		return true;
	}

	public Boolean bValidateLowPerformance()
	{
		validate_call_bValidateLowPerformance ++;
		validate_sequence = 2;
		validate_sequence2 = 2;
		return false;
	}
	
	public Boolean bValidateHighPerformance()
	{
		validate_call_bValidateHighPerformance ++;
		validate_sequence = 3;
		return false;
	}
		
	public void vidGoToNextState() {
		validate_call_bValidateGoToNextState++;
	}
}
