package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.model.FestivalType;
import com.techlabs.ocp.violation.model.FixedDeposit;

public class FixedDepositTest {
	
	public static void main(String[] args) {
		
		FixedDeposit fixedDeposit = new FixedDeposit(1, "vedshree", 15000, 2, FestivalType.DIWALI);
		System.out.println(fixedDeposit.calculateSimpleInterest());
		
	}

}
