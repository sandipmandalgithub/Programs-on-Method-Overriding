package org;

public class Developer extends Employee {
	@Override
	void work() {
		super.work();//'super' keyword is use to access the super class member
		System.out.println("Developing App");
		
	}

}
