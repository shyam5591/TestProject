package com.interview.fdesignpattern;

public class Samsung extends Phone {
    private String ram;
    private String camera;
    private String battery;

	public Samsung(String ram, String camera, String battery) {
		
		this.ram = ram;
		this.camera = camera;
		this.battery = battery;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getCAMERA() {
		// TODO Auto-generated method stub
		return this.camera;
	}

	@Override
	public String getBATTERY() {
		// TODO Auto-generated method stub
		return this.battery;
	}

}
