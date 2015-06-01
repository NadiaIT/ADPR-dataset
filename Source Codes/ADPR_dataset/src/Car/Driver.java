package Car;

public class Driver {

	Car car;
	Oil oil;

	public Driver(String carType) {
		if (carType.equals("BMW")) {
			car = new BMW();
			oil = new DieselOil();
		} else {
			car = new Ferari();
			oil = new GasolineOil();
		}

		// switch (carType) {
		// case "BMW":
		// car = new BMW();
		// oil = new DieselOil();
		// break;
		// case "Ferari":
		// car = new Ferari();
		// oil = new GasolineOil();
		// break;
		// }
	}

	public void drive() {
		oil.use();
		car.move();
	}
}
