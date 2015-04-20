import java.util.ArrayList;

/**
	This program demonstrates the Measurable class.
 */
public class MeasurableDemo {
	public static void main(String[] args) {
		Measurable<MeasurableString> measurable = new Measurable<MeasurableString>();
		ArrayList<MeasurableString> words = new ArrayList<MeasurableString>();
		words.add(new MeasurableString("Mary"));
		words.add(new MeasurableString("had"));
		words.add(new MeasurableString("a"));
		words.add(new MeasurableString("little"));
		words.add(new MeasurableString("lamb"));
		System.out.println("Largest word: " + measurable.largest(words).toString());
		System.out.println("Expected: little");
	}
}

