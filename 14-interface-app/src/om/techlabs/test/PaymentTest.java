package om.techlabs.test;

import com.techlabs.model.BankTransferPayment;
import com.techlabs.model.CreditCardPayment;
import com.techlabs.model.PayPalPayment;
import com.techlabs.model.Payment;

public class PaymentTest {
	public static void main(String[] args) {
		CreditCardPayment creditcard = new CreditCardPayment();
		PayPalPayment paypal = new PayPalPayment();
		BankTransferPayment bank = new BankTransferPayment();
		
		Payment pay;
		
		
		pay = creditcard;
		pay.payBill();
		pay.redeem();
		pay = paypal;
		pay.payBill();
		
		paypal.redeem();
		
		pay=bank;
		bank.payBill();
		bank.redeem();
		
		
		
	}


}
