package vehicle.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vehicle.app.State;

class MainTest {
	State state;
	@Test
	void validateMaintest() {
		state = new State();
		assertAll(
				()-> assertEquals(1,state.validate_call_bValidateGoToNextState),
				
				
				);
	
	}

}
