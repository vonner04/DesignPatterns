public class Fan {
	static final int HIGH = 3;
	static final int MEDIUM = 2;
	static final int LOW = 1;
	static final int OFF = 0;
	private int speed;

	public Fan() {
		speed = OFF;
	}

	public void high() {
		speed = HIGH;
		System.out.println("Fan is on high");
	}

	public void medium() {
		speed = MEDIUM;
		System.out.println("Fan is on medium");
	}

	public void low() {
		speed = LOW;
		System.out.println("Fan is on low");
	}

	public void off() {
		speed = OFF;
		System.out.println("Fan is off");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
	}
}