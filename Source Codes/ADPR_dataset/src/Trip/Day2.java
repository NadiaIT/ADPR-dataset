package Trip;

public class Day2 implements DaysOnTrip {

	int packageNo;

	@Override
	public void description() {
		// TODO Auto-generated method stub
		nightPlan();
	}

	public Day2(int no) {
		packageNo = no;
	}

	@Override
	public void breakfast() {

	}

	@Override
	public void visitPlaces() {

	}

	@Override
	public void lunch() {

	}

	@Override
	public void afternoonTrip() {

	}

	@Override
	public void nightPlan() {
		if (packageNo == 1) {
			System.out.println("Musical Session");
		} else if (packageNo == 2) {
			System.out.println("BBQ night");
		} else if (packageNo == 3) {
			System.out.println("Gaming");
		}

	}

	@Override
	public void dinner() {

	}

}
