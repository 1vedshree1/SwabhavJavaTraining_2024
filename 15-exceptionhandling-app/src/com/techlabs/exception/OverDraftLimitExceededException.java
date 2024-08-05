package com.techlabs.exception;

public class OverDraftLimitExceededException extends RuntimeException{
	
	private double overDraftLimit;
	
	public OverDraftLimitExceededException(double overDraftLimit) {
		super();
		this.overDraftLimit = overDraftLimit;
	}

	public String getMessage() {
		return "Over Draft Limit "+overDraftLimit+" is Exceeded.";
	}

}
