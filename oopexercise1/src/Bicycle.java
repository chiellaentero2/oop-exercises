/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Bicycle {
    private String ownerName;
	private String tagNo;
	
	
	public Bicycle() {
		ownerName = "Unknown";
		tagNo = "Unknown";
	}
	public Bicycle(String name, String tag){
		tagNo = tag;
		ownerName = name;
	}
	public String getOwnerName(){
		return ownerName;
	}
	public String getTagNo(){
		return tagNo;
	}
	public void setOwnerName(String name){
		ownerName = name;
	}
	public void setTagNo(String No){
		tagNo = No;
		
	}
	
}
