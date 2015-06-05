package Trip;

public class LuxuryPackage extends Trip{
	
	DaysOnTrip day1=new Day1(1);
	DaysOnTrip day2=new Day2(1);
	DaysOnTrip day3=new Day3(1);
	

	@Override
	public void DhakaToCoxsTrip() {
		System.out.println("Journey begins.Transport from Dhaka to Cox's Bazar by air");
	}

	@Override
	public void CoxsToDhakaReturn() {
		System.out.println("Return Journy.Transport from Cox's Bazar to Dhaka by air");
	}

	@Override
	public void visitPlaces() {
		day2.nightPlan();
	}

}
