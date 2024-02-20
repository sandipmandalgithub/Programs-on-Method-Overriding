package com.assignment;

public class Insta3 extends Insta2 {
	@Override
	void upload() {
		super.upload();
		System.out.println("more than 1 min videos are now supported");
	}
	@Override
	void dm() {
		super.dm();
		System.out.println("images and text are also supporetd");
	}
	void reel() {
		System.out.println("reels are supported");
	}

}
