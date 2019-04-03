package vehicle.test;

import static org.junit.jupiter.api.Assertions.*;
import vehicle.app.Global;
import vehicle.app.State;
import vehicle.hal.Temp;

import org.junit.jupiter.api.Test;


class StateTest {	
	State stateObj;

	@Test
	void testbValidateFailure_T() {
		stateObj = new State();
		Temp.r1 = 1;
		Temp.r2 = 2;
		boolean ret = stateObj.bValidateFailure();	

		assertAll(
			() ->	assertEquals(1, Temp.validateCall1),
			() ->	assertEquals(1, Temp.validateCall2),
			() ->	assertTrue(ret)
				);
	}
	
	@Test
	void testbValidateFailure_F() {
		stateObj = new State();
		Temp.r1 = 1;
		Temp.r2 =  1;
		boolean returnResult = stateObj.bValidateFailure();
		assertAll(
			
			() ->	assertEquals(1, Temp.validateCall1),
			() ->	assertEquals(false, returnResult),
			() ->	assertEquals(1,Temp.validateCall2)
				
				);
	}
	
	@Test
	void testVidGoToNextState_T_F_F() {
		stateObj = new State();
		stateObj.vidGoToNextState();
		assertEquals(1,State.validate_call_number);
		assertEquals(1,State.validate_call_times);
		assertEquals(4,Global.iState);
	
	}
	
	void testVidGoToNextState_F_T_F() {
		stateObj = new State();
		stateObj.vidGoToNextState();
		assertEquals(2,State.validate_call_number);
		assertEquals(1,State.validate_call_times);
		assertEquals(1,Global.iState);
	
	}

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
		assertEquals(3,Global.iState);
	
	}
	
}
