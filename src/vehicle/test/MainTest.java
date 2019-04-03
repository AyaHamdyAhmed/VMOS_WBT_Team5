package vehicle.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vehicle.app.State;
import vehicle.hal.LCD;
import vehicle.hal.Motor;

class MainTest {
	State state;

	@Test
	void validateMaintest() {
		state = new State();

		assertAll(() -> assertEquals(1, state.validate_call_bValidateGoToNextState),
				() -> assertEquals(1, Motor.motorCall),
				() -> assertEquals(1, LCD.lcdcall),
				() -> assertEquals(1, LCD.lcdSequenceNumber),
				() -> assertEquals(2, LCD.lcdSequenceNumber),
				()-> assertEquals(0,Motor.motorState),
				()-> assertEquals(0,LCD.lcdState)

		);

	}

}
