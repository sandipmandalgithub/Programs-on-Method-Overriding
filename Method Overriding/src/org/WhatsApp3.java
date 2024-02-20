package org;

public class WhatsApp3 extends WhatsApp2{
	@Override
	void sendMessage() {
		super.sendMessage();
		System.out.println("blue tick supported");
	}
	@Override
	void story() {
		super.story();
		System.out.println("videos are supported");
	}
	void payment() {
		System.out.println("make payment using whatsapp");
	}

}
