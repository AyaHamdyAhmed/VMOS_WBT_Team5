package vehicle.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 public class StateTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	
	void testvidGoToNextState_T_F_F() {
		State testobj = new State();
		testobj.vidGoToNextState();
		assertEquals(1,State.validate_call_bValidateFailure);
		assertEquals(0,State.validate_call_bValidateLowPerformance);
		assertEquals(0,State.validate_call_bValidateHighPerformance);
		assertEquals(1,State.validate_call_times);
		assertEquals(4,Global.iState);
		
	
	}
	
	void testvidGoToNextState_F_T_F() {
		State testobj = new State();
		testobj.vidGoToNextState();
		assertEquals(1,State.validate_call_bValidateFailure);
		assertEquals(1,State.validate_call_bValidateLowPerformance);
		assertEquals(0,State.validate_call_bValidateHighPerformance);
		assertEquals(2,State.validate_call_times);
		assertEquals(1,Global.iState);
	
	}

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
		assertEquals(3,Global.iState);
	
	}
	
}
