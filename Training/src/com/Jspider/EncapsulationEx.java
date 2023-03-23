package com.Jspider;

public class EncapsulationEx {
	String name;
	private String GirlFriendName;
	public EncapsulationEx(String name,String GirlFriendName) {
		this.name=name;
		this.GirlFriendName=GirlFriendName;
	}
	public String getGirlFriend() {
		return GirlFriendName;
	}
	public void setGirlFriend(String GirlFriendName) {
		this.GirlFriendName=GirlFriendName;
	}

}
