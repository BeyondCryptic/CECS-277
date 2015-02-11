
public class Education {
	
	private String degree;
	private String major;
	private int numberOfResearch;
	
	public Education() {
		degree = "";
		major = "";
		numberOfResearch = 0;
	}
	
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setResearch(int numberOfResearch) {
		this.numberOfResearch = numberOfResearch;
	}
	
	public String getDegree() {
		return degree;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int getResearch() {
		return numberOfResearch;
	}
	
}
