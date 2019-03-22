package DesignPattern;

public class adapterdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taxpay c1=new SGST();
		Product pro1=new Product("btwin rockride 340",(float)500,45, c1);
		//pro1.setQuantity(3);
		pro1.setPrice((float)100);
		pro1.printPrice();
		System.out.println("---new tax is ---");
		pro1.setct(new CGST());
		pro1.printPrice();

	}

}

