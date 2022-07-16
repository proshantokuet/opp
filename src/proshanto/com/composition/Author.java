package proshanto.com.composition;

import proshanto.com.aggregation.Address;

public class Author {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private Address address;
	
	

}
