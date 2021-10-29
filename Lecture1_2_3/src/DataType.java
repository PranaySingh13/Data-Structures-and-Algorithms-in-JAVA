
public class DataType {

	public static void main(String[] args) {

		char c = 'a';
		System.out.println(c + 3);

		int i = c + 10;
		System.out.println(i);

		// Up conversion is possible but down conversion doesn't.

		// Here Implicit Typecasting is happening

		i = c;
		// char abc=i;

		long l = i;
		// i=l;

		double d = i;
		// i=d;

		float f = 1.23f;
		// f=d;
		d = f;

		// Explicit Typecasting
		l = 12345654321L;
		i = (int) l;
		System.out.println(l);
		System.out.println(i);
		
		int a = 'c';
		System.out.println(a);
	}

}
