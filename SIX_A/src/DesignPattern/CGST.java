package DesignPattern;

public class CGST implements taxpay{

	@Override
	public float taxamount(float price, int qty) {
		
		return (float) (0.08*price*qty);
		
	}

}
