package vehicle.app;

import vehicle.hal.LCD;
import vehicle.hal.Motor;

public class Main {
	State state;
	public void vidMain() {
	    state = new State();
		state.vidGoToNextState();
		LCD.vidOutput(Global.iState);
		Motor.vidOutput(Global.iState);
	}
}
