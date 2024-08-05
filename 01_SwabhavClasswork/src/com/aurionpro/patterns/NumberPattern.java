package com.aurionpro.patterns;

public class NumberPattern {
	
	public static void main(String[] args) {
		int i,j;
		int num=1;
		int range = 5;
		
		for(i=0;i<=range; i++) {
			
			for(j=1;j<=i;j++) {
				
				System.out.print(num+" ");
				num++;
			}
			
			System.out.println();
		}
	}

}
