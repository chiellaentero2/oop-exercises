/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class BicycleRegistration {
  public static void main(String [] args) {
		Bicycle bike1, bike2, bike3,chill;
		String owner1, owner2, tagNo, owner;
		
		bike1 = new Bicycle();
		bike1.setOwnerName("Chiella Entero");
		
		bike2 = new Bicycle();
		bike2.setOwnerName("Jospehine Lomanta");
		
		bike3 = new Bicycle();
		bike3.setTagNo("2004-134R");
		
		chill = new Bicycle();
		chill.setOwnerName("Chiella");
		chill.setTagNo("2005");
		
		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		tagNo = bike3.getTagNo();
		owner = chill.getOwnerName();
		tagNo = chill.getTagNo();
		
		System.out.println(owner1 + " owns a bicycle.");
		System.out.println(owner2 + " also owns a bicycle.");
		System.out.println(tagNo);
		System.out.println(owner + " " +tagNo);
	}
}  

