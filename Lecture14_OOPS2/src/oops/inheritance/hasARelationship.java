package oops.inheritance;

class Address {
	String city, state, country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Employees {

	int id;
	String name;

	// Aggregation(Employee HAS-A address.)
	Address address;

	public Employees(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + ", " + address.state + " - " + address.country);
	}
}

/*
 * Aggregation in Java If a class have an entity reference, it is known as
 * Aggregation. Aggregation represents HAS-A relationship.
 */
public class hasARelationship {

	public static void main(String[] args) {
		/*
		 * When use Aggregation?
		 * 
		 * Code reuse is also best achieved by aggregation when there is no is-a
		 * relationship.
		 * 
		 * Inheritance should be used only if the relationship is-a is maintained
		 * throughout the lifetime of the objects involved; otherwise, aggregation is
		 * the best choice.
		 */

		Address add1 = new Address("Indore", "M.P.", "India");
		Address add2 = new Address("Kota", "Rajasthan", "India");

		Employees emp1 = new Employees(1, "Pranay", add1);
		Employees emp2 = new Employees(2, "Shanu", add2);

		emp1.display();
		emp2.display();

	}

}
