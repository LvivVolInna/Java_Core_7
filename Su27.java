package hw7;

import java.util.Random;

public class Su27 extends Plane implements SpecialOpportunities {

	private String color;
	private String planeName;

	public Su27(double length, double width, double weight, double maxSpeed, String color, String planeName) {
		super(length, width, weight, maxSpeed);
		this.color = color;
		this.planeName = planeName;
	}

	@Override
	void engineStartTime() {
		Random engineStartTime = new Random();
		for (int i = 1; i < 2; i++) {
			double timeForEngineStartTime = engineStartTime.nextDouble();
			System.out.println("Left before takeoff "
					+ (double) Math.round((timeForEngineStartTime * 100 + 20.88) * 100) / 100 + " sec.");
		}

	}

	@Override
	void takeOffThePlain() {
		Random takeOffThePlain = new Random();
		for (int i = 1; i < 2; i++) {
			double lengthForTakeOffThePlain = takeOffThePlain.nextDouble();
			System.out.println("The plain will fly " + (double) Math.round(lengthForTakeOffThePlain * 1000 * 100) / 100
					+ " kilometers on a full tank of fuel.");
		}

	}

	@Override
	void landingThePlain() {
		System.out.println("The plain is landing.");

	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	@Override
	public void turboAccelerating() {
		Random turboAccelerating = new Random();
		double turboForTurboAccelerating = turboAccelerating.nextDouble();
		double speed = getMaxSpeed() + (double) Math.round(turboForTurboAccelerating * 1000 * 100) / 100;
		System.out.println("Turbo acceleration speed : " + speed + ".");
	}

	@Override
	public void stellsTechnology() {
		Random stellsTechnology = new Random();
		int timeForStellsTecnology = stellsTechnology.nextInt(20);
		System.out.println("The plain will be invisible for " + timeForStellsTecnology + " sec.");
	}

	@Override
	public void nuclearStrice() {
		Random nuclearStrice = new Random();
		int numForNuclearStrice = nuclearStrice.nextInt(11);
		System.out.println(numForNuclearStrice + " nuclear warheads will be dropped.");
	}

	@Override
	public void moveUp(double kilometer) {
		Random moveUp = new Random();
		double kilometerOfMoveUp = moveUp.nextDouble();
		System.out.println(
				"Plane is moving UP on " + (double) Math.round(kilometerOfMoveUp * 10 * 100) / 100 + " kilometers.");
	}

	@Override
	public void moveDown(double kilometer) {
		Random moveDown = new Random();
		double kilometerOfMoveDown = moveDown.nextDouble();
		System.out.println("Plane is moving DOWN on " + (double) Math.round(kilometerOfMoveDown * 10 * 100) / 100
				+ " kilometers.");
	}

	@Override
	public void moveRight(double kilometer) {
		Random moveRight = new Random();
		double kilometerOfMoveRight = moveRight.nextDouble();
		System.out.println("Plane is moving RIGHT on " + (double) Math.round(kilometerOfMoveRight * 100 * 100) / 100
				+ " kilometers.");
	}

	@Override
	public void moveLeft(double kilometer) {
		Random moveLeft = new Random();
		double kilometerOfMoveLeft = moveLeft.nextDouble();
		System.out.println("Plane is moving LEFT on " + (double) Math.round(kilometerOfMoveLeft * 100 * 100) / 100
				+ " kilometers.");
	}

	@Override
	public String toString() {
		return "Su27 [color=" + color + ", planeName=" + planeName + ", length=" + length + ", width=" + width
				+ ", weight=" + weight + ", maxSpeed=" + maxSpeed + "]";
	}

}
