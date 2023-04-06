package com.workexp;

public class EncapsulationDriver {

	public static void main(String[] args) {
		EncapsulationEx ex =new EncapsulationEx("Lokesh", "SHELLA");
		System.out.println(ex.name);
//		System.out.println(ex.GirlFriendName());
		System.out.println(ex.getGirlFriend());
		ex.setGirlFriend("mala");
		System.out.println(ex.getGirlFriend());
	}

}
