package com.abstractionpractise1.java;

public class Bmw extends Car {
public void engineSecret() {
	System.out.println("Bmw engineSecret");

}
public void companyDatabase() {
	System.out.println("Bmw companyDatabase");

}

public static void main(String[] args) {
	Car car= new Bmw();
	car.engineSecret();
	car.companyDatabase();
}
}