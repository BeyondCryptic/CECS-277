
public class MeasurableString implements Comparable<MeasurableString> {
	
	public String data;
	public int length;
	
	public MeasurableString() {
		data = "";
		length = 0;
	}
	
	public MeasurableString(String data) {
		this.data = data;
		this.length = getMeasure();
	}
	
	public int getMeasure() {
		return data.toCharArray().length;
	}
	
	public int compareTo(MeasurableString s) {
		return this.length-s.length;
	}
	
	public String toString() {
		return data;
	}

}
