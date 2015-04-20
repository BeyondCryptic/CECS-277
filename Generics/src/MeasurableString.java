
public class MeasurableString {
	
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

	public String toString() {
		return data;
	}

}
