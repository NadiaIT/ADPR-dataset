package GameScene;

public class MainApp {
	public static void main(String[] args) {

		System.out.println("This is Scenario 1");
		IScenario s1 = new Scenario1();
		s1.draw();
		System.out.println("This is Scenario 2");
		IScenario s2 = new Scenario2();
		s2.draw();

	}
}
