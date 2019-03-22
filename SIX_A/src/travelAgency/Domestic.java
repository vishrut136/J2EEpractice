package travelAgency;

public abstract class Domestic implements BookFlight {
	String s1;
	public String booking()
	{
		s1="Domestic flight";
		return s1;
	}
	public abstract void localbooking();

}
