package com.aurionpro.patterns;

public class StarPattern {
	
	public static void main(String[] args) {
		int i,j;
		int range = 5;
		
		for(i=0;i<=range; i++) {
			
			for(j=1;j<=i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
