package com.abc.immutable;

public class ImmutableContact {
	private final String name;
	private final String address;

	public ImmutableContact(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "ImmutableContact [name=" + name + ", address=" + address + "]";
	}

	public ImmutableContact modifyContact(String name, String address) {
		if (this.name.equals(name) && this.address.equals(address)) {
			return this;
		} else {
			System.out.println("new object is creating");
			return new ImmutableContact(name, address);
		}
	}

	public static void main(String[] args) {
		ImmutableContact contact = new ImmutableContact("Abhishek", "A11/702, Kumar Park Infinia, Pune");
		System.out.println(contact);
		//Similar to string concat()
		ImmutableContact contact1 = contact.modifyContact("Abhishek", "A11/702, Kumar Park Infinia, Pune, 412308");
		System.out.println(contact1);
		
	}

}
