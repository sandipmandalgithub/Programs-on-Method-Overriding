package com.assignment;

public class Insta2 extends Insta1{
	@Override
	void upload() {
		super.upload();
		System.out.println("less than 1 min videos are also supported");
	}
	void dm() {
		System.out.println("text are supported");
	}

}
