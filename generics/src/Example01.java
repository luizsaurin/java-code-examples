public class Example01 {
    public static void main(String[] args) throws Exception {

		Printer<Integer> integerPrinter = new Printer<>(10);
		integerPrinter.print();

		Printer<Double> doublePrinter = new Printer<>(10.0);
		doublePrinter.print();

		Printer<String> stringPrinter = new Printer<>("some text");
		stringPrinter.print();

    }
}

class Printer<T> {
	
	T thingToPrint;

	public Printer(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void print() {
		System.out.println(thingToPrint);
	}
}
