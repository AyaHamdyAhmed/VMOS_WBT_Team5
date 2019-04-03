package vehicle.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

 public class StateTest {

	State stateObj;
	
	@Test
<<<<<<< HEAD
	
	void testvidGoToNextState_T_F_F() {
		State testobj = new State();
		testobj.vidGoToNextState();
		assertEquals(1,State.validate_call_bValidateFailure);
		assertEquals(0,State.validate_call_bValidateLowPerformance);
		assertEquals(0,State.validate_call_bValidateHighPerformance);
=======
	void testVidGoToNextState_T_F_F() {
		stateObj = new State();
		stateObj.vidGoToNextState();
		assertEquals(1,State.validate_call_number);
>>>>>>> 2feadc03def3832131a418e6e5266ffd6757668d
		assertEquals(1,State.validate_call_times);
		assertEquals(4,Global.iState);
		
	
	}
	
<<<<<<< HEAD
	void testvidGoToNextState_F_T_F() {
		State testobj = new State();
		testobj.vidGoToNextState();
		assertEquals(1,State.validate_call_bValidateFailure);
		assertEquals(1,State.validate_call_bValidateLowPerformance);
		assertEquals(0,State.validate_call_bValidateHighPerformance);
		assertEquals(2,State.validate_call_times);
=======
	void testVidGoToNextState_F_T_F() {
		stateObj = new State();
		stateObj.vidGoToNextState();
		assertEquals(2,State.validate_call_number);
		assertEquals(1,State.validate_call_times);
>>>>>>> 2feadc03def3832131a418e6e5266ffd6757668d
		assertEquals(1,Global.iState);
	
	}

<<<<<<< HEAD
	void testvidGoToNextState_F_F_T() {
		State testobj = new State();
		testobj.vidGoToNextState();
		assertEquals(1,State.validate_call_bValidateFailure);
		assertEquals(1,State.validate_call_bValidateLowPerformance);
		assertEquals(1,State.validate_call_bValidateHighPerformance);
		assertEquals(3,State.validate_call_times);
		assertEquals(2,Global.iState);
	
	}
	void testvidGoToNextState_F_F_F() {
		State testobj = new State();
		testobj.vidGoToNextState();
		assertEquals(1,State.validate_call_bValidateFailure);
		assertEquals(1,State.validate_call_bValidateLowPerformance);
		assertEquals(1,State.validate_call_bValidateHighPerformance);
		assertEquals(3,State.validate_call_times);
=======
	void testVidGoToNextState_F_F_T() {
		stateObj = new State();
		stateObj.vidGoToNextState();
		assertEquals(3,State.validate_call_number);
		assertEquals(1,State.validate_call_times);
		assertEquals(2,Global.iState);
	
	}
	void testVidGoToNextState_F_F_F() {
		stateObj = new State();
		stateObj.vidGoToNextState();
		assertEquals(0,State.validate_call_number);
		assertEquals(0,State.validate_call_times);
>>>>>>> 2feadc03def3832131a418e6e5266ffd6757668d
		assertEquals(3,Global.iState);
	
	}
	
}
