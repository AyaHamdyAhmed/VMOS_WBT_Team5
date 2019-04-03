package vehicle.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vehicle.app.State;
import vehicle.hal.LCD;
import vehicle.hal.Motor;

public class MainTest {

	@Test
	void validateMaintest() {
		//soft assertion 
		assertAll(() -> assertEquals(1, State.validate_call_bValidateGoToNextState),
				() -> assertEquals(1, Motor.motorCall),
				() -> assertEquals(1, LCD.lcdcall),
				() -> assertEquals(2, LCD.SequenceNumber),
				()-> assertEquals(0,Motor.motorState),
				()-> assertEquals(0,LCD.lcdState)


		);
	}

}
