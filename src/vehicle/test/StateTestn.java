package vehicle.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;

import vehicle.app.Global;
import vehicle.app.State;
import vehicle.hal.Temp;

 public class StateTestn {
	
	State stateObj;

	@Test
	public void testbValidateFailure_T() {
		stateObj = new State();
		Temp.r1 = 1;
		Temp.r2 = 2;
		Temp.validateCall1 = 0;
		Temp.validateCall2 = 0;
		boolean ret = stateObj.bValidateFailure();	

		assertAll(
			() ->	assertEquals(1, Temp.validateCall1),
			() ->	assertEquals(1, Temp.validateCall2),
			() ->	assertTrue(ret)
			);
	}
	
	@Test
	public void testbValidateFailure_F() {
		stateObj = new State();
		Temp.r1 = 1;
		Temp.r2 =  1;
		Temp.validateCall1 = 0;
		Temp.validateCall2 = 0;
		boolean returnResult = stateObj.bValidateFailure();
		assertAll(
			
			() ->	assertEquals(1, Temp.validateCall1),
			() ->	assertEquals(false, returnResult),
			() ->	assertEquals(1,Temp.validateCall2)
				
				);
	}
	
	@Test
	public void testVidGoToNextState_T_F_F() {
		stateObj = new State();
		stateObj.vidGoToNextState();
		//soft assert
		assertAll(
		() -> assertTrue(stateObj.bValidateFailure()),		
		() -> assertEquals(1,State.validate_call_bValidateFailure),
		() -> assertEquals(0,State.validate_call_bValidateLowPerformance),
		() -> assertEquals(0,State.validate_call_bValidateHighPerformance),
		() -> assertEquals(1,State.validate_call_times),
		() -> assertEquals(4,Global.iState)
		);
	}
	
	@Test
	public void testVidGoToNextState_F_T_F() {
		stateObj = new State();
		stateObj.vidGoToNextState();
		//soft assert
		assertAll(
		() -> assertTrue(!stateObj.bValidateFailure()),
		() -> assertTrue(stateObj.bValidateLowPerformance()),
		() -> assertEquals(1,State.validate_call_bValidateFailure),
		() -> assertEquals(1,State.validate_call_bValidateLowPerformance),
		() -> assertEquals(0,State.validate_call_bValidateHighPerformance),
		() -> assertEquals(2,State.validate_call_times),
		() -> assertEquals(1,Global.iState)
		);
	}

	@Test
	public void testVidGoToNextState_F_F_T() {
		stateObj = new State();
		stateObj.vidGoToNextState();
		//soft assert
		assertAll(
		() -> assertTrue(!stateObj.bValidateFailure()),
		() -> assertTrue(!stateObj.bValidateLowPerformance()),
		() -> assertTrue(stateObj.bValidateHighPerformance()),
		() -> assertEquals(1,State.validate_call_bValidateFailure),
		() -> assertEquals(1,State.validate_call_bValidateLowPerformance),
		() -> assertEquals(1,State.validate_call_bValidateHighPerformance),
		() -> assertEquals(3,State.validate_call_times),
		() -> assertEquals(2,Global.iState)
		);
	
	}
	@Test
	public void testVidGoToNextState_F_F_F() {
		stateObj = new State();
		stateObj.vidGoToNextState();
		//soft assert
		assertAll(
		() -> assertTrue(!stateObj.bValidateFailure()),
		() -> assertTrue(!stateObj.bValidateLowPerformance()),
		() -> assertTrue(!stateObj.bValidateHighPerformance()),
		() -> assertEquals(1,State.validate_call_bValidateFailure),
		() -> assertEquals(1,State.validate_call_bValidateLowPerformance),
		() -> assertEquals(1,State.validate_call_bValidateHighPerformance),
		() -> assertEquals(3,State.validate_call_times),
		() -> assertEquals(3,Global.iState)
		);
	}
	
}

