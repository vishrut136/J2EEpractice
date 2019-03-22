package DesignPattern;

public class SGST implements taxpay {

	@Override
	public float taxamount(float price, int qty) {
		
		return (float) (0.18*price*qty);
		
	}
}