package DesignPattern;

public class Product {

	String name;
	float price;
	int qty;
	float tax;
	taxpay c1;
	
	Product(String name,float price,int qty,taxpay c1)
	{
		this.name=name;
		this.price=price;
		this.qty=qty;
		this.c1=c1;
	}
	int setQuantity(int q)
	{
		this.qty=q;
		return qty;
	}
	public float setPrice(float f)
	{
		this.price=f;
		return price;
	}
	
	
	public void printPrice() {
		// TODO Auto-generated method stub
		double tax=c1.taxamount(price,qty);
		System.out.println("billed amount"+price*qty);
		System.out.println("total amount"+((price*qty)+tax));
		//return tax;
		
	}
	public void setct(CGST cgst) {
		this.c1=cgst;
		// TODO Auto-generated method stub
		
	}
	
}
