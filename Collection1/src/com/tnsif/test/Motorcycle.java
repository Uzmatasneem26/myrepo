package com.tnsif.test;

public class Motorcycle extends Vehicle{
	private boolean hasSidecar;

	public Motorcycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motorcycle(String model, String brand, int year) {
		super(model, brand, year);
		// TODO Auto-generated constructor stub
	}

	public Motorcycle(boolean hasSidecar) {
		super();
		this.hasSidecar = hasSidecar;
	}

	public boolean isHasSidecar() {
		return hasSidecar;
	}

	public void setHasSidecar(boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}
	
	@Override
	public String toString() {
		return "Motorcycle [hasSidecar=" + hasSidecar + "]";
	}

	void start() {
		System.out.println("Start Motercycle");
		}
	void stop() {
		System.out.println("Stop Motercycle");
	}
	String getDetails() {
		return toString();
	}
	
}
