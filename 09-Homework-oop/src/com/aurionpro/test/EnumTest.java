package com.aurionpro.test;

import com.aurionpro.model.Day;

public class EnumTest {
	public static void main(String[] args) {
		
	
	Day today = Day.MONDAY;
    
    // Switch statement based on enum values
    switch (today) {
        case SUNDAY:
            System.out.println("Today is Sunday");
            break;
        case MONDAY:
            System.out.println("Today is Monday");
            break;
        case TUESDAY:
            System.out.println("Today is Tuesday");
            break;
        case WEDNESDAY:
            System.out.println("Today is Wednesday");
            break;
        case THURSDAY:
            System.out.println("Today is Thursday");
            break;
        case FRIDAY:
            System.out.println("Today is Friday");
            break;
        case SATURDAY:
            System.out.println("Today is Saturday");
            break;
        default:
            System.out.println("Invalid day");
            break;
    }
    
    // Iterating over all enum constants
    System.out.println("Days of the week:");
    for (Day day : Day.values()) {
        System.out.println(day);
    }
	}
}


