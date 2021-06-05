package com.anupcodes.springdemo;

import java.util.ArrayList;
import java.util.Collections;

public class HumanMain {

	public static void main(String[] args) {
		ArrayList<Human> h = new ArrayList<>();
		Human human = new Human();
		human.setAge(25);
		human.setMiddleName("Deepak");
		human.setName("Anup");
		human.setSurName("Shastri");
		h.add(human);
		Human human2 = new Human();
		human2.setAge(17);
		human2.setName("Aditi");
		human2.setMiddleName("Deepak");
		human2.setSurName("Shastri");
		h.add(human2 );
		
		Collections.sort(h, Human.NameComparator);
		
		System.out.println(h.toString());

	}

}
