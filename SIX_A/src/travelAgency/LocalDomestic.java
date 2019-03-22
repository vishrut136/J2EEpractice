package travelAgency;

public class LocalDomestic extends Domestic implements LocalTransport{
	String s1;
	public void localbooking() {
		 s1="domestic flight for local travelling";
	}
	public String booking() {
		return s1;
	}

}
