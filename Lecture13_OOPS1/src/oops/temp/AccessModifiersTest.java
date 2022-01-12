package oops.temp;

import oops.accessModifiers.AccessModifier;

public class AccessModifiersTest {

	public static void main(String[] args) {

		AccessModifier am = new AccessModifier();
		// am.name = "Pranay"; // not access
		am.age = 28;
		// am.address="Indore"; //not access because it is not child class object
		// am.id //not access

	}

}
