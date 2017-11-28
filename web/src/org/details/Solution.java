package org.details;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String[] args) {
		
		User user1 = new User();	
		
		user1.setFirstName("JENI");
		user1.setLastName("SRI");
		user1.setEmailid("myworld@gmail.com");
		user1.setPhoneNo(8780475309L);
		user1.setCity("Salem");
		user1.setLocation("Attur");
		user1.setState("Tamil Nadu");
		user1.setPincode(638109L);
		user1.setStreet("paris corner");
		user1.setGender("FEMALE");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(user1);
		
		session.getTransaction().commit();
		session.close();
	}

}