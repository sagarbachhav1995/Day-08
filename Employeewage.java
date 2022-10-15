package com.day08.java;
import java.util.Random;
class Employee {
	static final int IS_FULL_TIME = 1;// constants
	static final int IS_PART_TIME = 2;// constants
	static final int EMP_WAGE_PER_DAY = 20;
	static final int EMP_WAGE_FOR_MONTH = 20;

	/*
	 * generating random numbers with in 3 using random functions
	 */
	public static int empCheck() {
		Random random = new Random();
		int empCheck = random.nextInt(3);
		return empCheck;
	}

	/*
	 * calculating employee work hours
	 */
	public static int empSalary(int empCheck) {
		int empWrkHrs;
		switch (empCheck) {
		case IS_FULL_TIME -> empWrkHrs = 8;
		case IS_PART_TIME -> empWrkHrs = 4;
		default -> empWrkHrs = 0;
		}
		int empWage = empWrkHrs * EMP_WAGE_PER_DAY;
		System.out.println("empWage = " + empWage);
		return empWage;
	}

	/*
	 * calculating employee total salary
	 */
	public static int totalEmpSalary() {
		int day = 0;
		int totalEmpSalary = 0;
		int empWage = 0;
		int empCheck = 0;
		while (day < EMP_WAGE_FOR_MONTH) {
			empCheck = empCheck();
			empWage = empSalary(empCheck);
			++day;
			totalEmpSalary += empWage;
		}
		return totalEmpSalary;
	}
}

// Main Class
// Main Methods
public class Employeewage {
	public static void main(String[] args) {
		int totalEmpSalary;
		System.out.println("Welcome To Employee Wage Computation Using OOP's");
		totalEmpSalary = Employee.totalEmpSalary();
		System.out.println("totalEmpSalary = " + totalEmpSalary);	}

}
