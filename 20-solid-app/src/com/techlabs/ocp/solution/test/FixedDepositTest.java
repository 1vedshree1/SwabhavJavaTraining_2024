package com.techlabs.ocp.solution.test;

import com.techlabs.ocp.solution.model.DiwaliInterest;
import com.techlabs.ocp.solution.model.FixedDeposit;
import com.techlabs.ocp.solution.model.HoliInterest;
import com.techlabs.ocp.solution.model.IFestivalInterest;

public class FixedDepositTest {
	public static void main(String[] args) {
		IFestivalInterest diwali = new DiwaliInterest();
		IFestivalInterest holi = new HoliInterest();
		FixedDeposit fixedDeposit = new FixedDeposit(1, "Vedshree", 15000, 2, new DiwaliInterest());
		FixedDeposit fixedDeposit1 = new FixedDeposit(1, "Vedshree", 15000, 2, new HoliInterest());
		System.out.println(fixedDeposit.calculateSimpleInterest(diwali));
		System.out.println(fixedDeposit1.calculateSimpleInterest(holi));

		
	}
	
}
