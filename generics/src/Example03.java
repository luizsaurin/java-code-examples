public class Example03 {
	public static void main(String[] args) {
		
		shoutV1("Hi");
		shoutV1(100);

		shoutV2("Hello", "John");
	}

	static <T> void shoutV1(T thingToShout) {
		System.out.println(thingToShout + "!!!!!!");
	}

	static <T,V> void shoutV2(T thingToShout, V otherThingToShout) {
		System.out.println(thingToShout + "!!!");
		System.out.println(otherThingToShout + "!!!");
	}

}
