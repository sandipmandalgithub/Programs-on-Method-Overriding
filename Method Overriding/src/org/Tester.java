package org;

public class Tester extends Employee {
	@Override
	void work() {
		super.work();// 'super' keyword is use to access the super class member
		System.out.println("Testing App");
	}

}
