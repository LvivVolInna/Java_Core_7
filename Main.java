package hw7;

public class Main {

	public static void main(String[] args) {
		Plane su27 = new Su27(22.0, 14.7, 22.22, 2000.0, "silver", "Su27");
		System.out.println(su27);

		su27.engineStartTime();
		su27.takeOffThePlain();
		su27.moveUp(5.3);
		su27.moveLeft(2);
		su27.moveDown(3.7);
		su27.moveRight(7);
		((Su27) su27).stellsTechnology();
		((Su27) su27).nuclearStrice();
		((Su27) su27).turboAccelerating();
		su27.landingThePlain();

	}

}
