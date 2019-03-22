package com.strings.myproject;

public class ToStringMethodBase {
	private int iVal = 1988;
	
	public int getIVal() {
		return this.iVal;
	}
	
	public void setIVal(int iVal){
		this.iVal = iVal;
	}
	
	public ToStringMethodBase() {};
	public ToStringMethodBase(int iVal) {
		this.iVal = iVal;
	};
	
	@Override
	public String  toString(){
		if(this.iVal != 1988) {
			return "ToStringMethodBase #" + iVal;
		} else {
			return "ToStringMethodBase";
		}
	}
}
