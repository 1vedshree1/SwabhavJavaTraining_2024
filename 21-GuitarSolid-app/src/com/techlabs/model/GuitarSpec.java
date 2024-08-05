package com.techlabs.model;

public class GuitarSpec {
	
	
	private Builder builder;
	private String model;
	private Type type;
	private int numString;
	private Wood backwood;
	private Wood topwood;
	public GuitarSpec(Builder builder, String model, Type type, int numString, Wood backwood, Wood topwood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numString = numString;
		this.backwood = backwood;
		this.topwood = topwood;
	}
	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getNumString() {
		return numString;
	}
	public void setNumString(int numString) {
		this.numString = numString;
	}
	public Wood getBackwood() {
		return backwood;
	}
	public void setBackwood(Wood backwood) {
		this.backwood = backwood;
	}
	public Wood getTopwood() {
		return topwood;
	}
	public void setTopwood(Wood topwood) {
		this.topwood = topwood;
	}
	public boolean matches(GuitarSpec otherSpec) {
		if(builder != otherSpec.builder)
			return false;
		if((model != null)&&(!model.equals(""))&&(!model.equals(otherSpec.model)))
			return false;
		if(type!= otherSpec.type)
			return false;
		if(numString != otherSpec.numString)
			return false;
		if(backwood != otherSpec.backwood)
			return false;
		if(topwood != otherSpec.topwood)
			return false;
		// TODO Auto-generated method stub
		
		return true;
	}
	@Override
	public String toString() {
		return "GuitarSpec [builder=" + builder + ", model=" + model + ", type=" + type + ", numString=" + numString
				+ ", backwood=" + backwood + ", topwood=" + topwood + "]";
	}
	

}
