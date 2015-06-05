package Trip;

public abstract class Trip {

	public void description()
	{
		DhakaToCoxsTrip();
		visitPlaces();
		CoxsToDhakaReturn();
	}
	public abstract void DhakaToCoxsTrip();
	public abstract void CoxsToDhakaReturn();
	public abstract void visitPlaces();
}
