package com.day08.java;

import java.util.Random;

public class Employeewage {
	public static void empWage() {
		Random ran = new Random();
		int PREASENT = 1;
		int empCheck = ran.nextInt(2);
		if (empCheck == PREASENT) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Using OOP's");
		empWage();	}

}
