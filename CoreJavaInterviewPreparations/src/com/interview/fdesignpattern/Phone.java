package com.interview.fdesignpattern;

public abstract class Phone {
public abstract String getRAM();
public abstract String getCAMERA();
public abstract String getBATTERY();
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "RAM= "+this.getRAM()+",CAMERA="+this.getCAMERA()+",BATTERY="+this.getBATTERY();
	}

}
