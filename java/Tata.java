package com.abstractionpractise1.java;

public class Tata extends Car {
	public void engineSecret() {
		System.out.println("Tata engineSecret");

	}
	public void companyDatabase() {
		System.out.println("Tata companyDatabase");

	}

	public static void main(String[] args) {
	    Car car= new Tata();
		car.engineSecret();
		car.companyDatabase();
	}
	}
