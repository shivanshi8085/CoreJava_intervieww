package com.rays.oop.businessman;

public class TestBusiness {
	public static void main(String[] args) {

		BusinessMan b = new BusinessMan();
		Richman r = new BusinessMan();

		r.donation();
		r.earnMoney();
		r.party();

		SocialWorker s = new BusinessMan();
		s.helpToOthers();

	}

}
