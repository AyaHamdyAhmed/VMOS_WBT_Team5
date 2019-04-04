package vehicle.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vehicle.app.Main;
import vehicle.app.State;
import vehicle.hal.LCD;
import vehicle.hal.Motor;


public class MainTest {
Main main;

	@Test
	public void validateMaintest() {

	
main = new Main();
main.vidMain();
		// soft assert
		assertAll(
				() -> assertEquals(1, State.validate_call_bValidateGoToNextState),
				()-> assertEquals(0,Motor.motorState),
				()-> assertEquals(0,LCD.lcdState),
				() -> assertEquals(1, LCD.lcdcall),
				() -> assertEquals(1, Motor.motorCall),
				() -> assertEquals(2, LCD.SequenceNumber)

		);
	}

}
