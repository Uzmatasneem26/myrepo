package com.tnsif.interface2;

public class Demo {

	public static void main(String[] args) {
		Payment creditcard = new CreditCard("123456");
		creditcard.process(2000);
		
		Payment upi = new UPI("123456@ybl");
		upi.process(1000);
		
		Payment debitcard = new DebitCard("234561762");
		debitcard.process(3000);
		
		PaymentService ps = new PaymentService();
		ps.makePayment(creditcard,77); 
		ps.makePayment(debitcard,1000); 
	}

}