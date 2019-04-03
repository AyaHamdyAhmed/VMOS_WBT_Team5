package vehicle.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vehicle.app.Global;
import vehicle.app.State;

 public class StateTest {

	State stateObj;
	
	@Test
	void testvidGoToNextState_T_F_F() {
		State testobj = new State();
		testobj.vidGoToNextState();
		assertEquals(1,State.validate_call_bValidateFailure);
		assertEquals(0,State.validate_call_bValidateLowPerformance);
		assertEquals(0,State.validate_call_bValidateHighPerformance);
	}
	
	@Test
	void testvidGoToNextState_F_T_F() {
		State testobj = new State();
		testobj.vidGoToNextState();
		assertEquals(1,State.validate_call_bValidateFailure);
		assertEquals(1,State.validate_call_bValidateLowPerformance);
		assertEquals(0,State.validate_call_bValidateHighPerformance);
		assertEquals(2,State.validate_call_times);
	}

	@Test
	void testvidGoToNextState_F_F_T() {
		State testobj = new State();
		testobj.vidGoToNextState();
		assertEquals(1,State.validate_call_bValidateFailure);
		assertEquals(1,State.validate_call_bValidateLowPerformance);
		assertEquals(1,State.validate_call_bValidateHighPerformance);
		assertEquals(3,State.validate_call_times);
		assertEquals(2,Global.iState);
	
	}
	@Test
	void testvidGoToNextState_F_F_F() {
		State testobj = new State();
		testobj.vidGoToNextState();
		assertEquals(1,State.validate_call_bValidateFailure);
		assertEquals(1,State.validate_call_bValidateLowPerformance);
		assertEquals(1,State.validate_call_bValidateHighPerformance);
		assertEquals(3,State.validate_call_times);
	}
	
}
