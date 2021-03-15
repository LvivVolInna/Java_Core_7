package hw7;

public abstract class Plane {
	public AircraftControl getAircraftControl() {
		return aircraftControl;
	}

	public void setAircraftControl(AircraftControl aircraftControl) {
		this.aircraftControl = aircraftControl;
	}

	double length;
	double width;
	double weight;
	double maxSpeed;

	public Plane(double length, double width, double weight, double maxSpeed) {
		this.length = length;
		this.width = width;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
	}

	// створюємо об'єкт для делегування рухів
	private AircraftControl aircraftControl = new AircraftControl();

	public void moveUp(double kilometer) {
		aircraftControl.up(kilometer);
	}

	public void moveDown(double kilometer) {
		aircraftControl.down(kilometer);
	}

	public void moveRight(double kilometer) {
		aircraftControl.right(kilometer);
	}

	public void moveLeft(double kilometer) {
		aircraftControl.left(kilometer);
	}

	abstract void engineStartTime();

	abstract void takeOffThePlain();

	abstract void landingThePlain();

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
