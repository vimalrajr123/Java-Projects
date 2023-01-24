package basicJava2;

public class Car {
	private String doors;
	private String engine;
	private String driver;
	public int speed;

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isCarRunning() {
		if (doors.equals("closed") && engine.equals("on") && speed > 0) {
			return true;
		}
		return false;

	}

}
