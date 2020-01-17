public class Duration {
	private int hours;
	private int minutes;
	
	public Duration(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public String toString() {
		String s = String.format("%d hours %d minutes %n", hours, minutes);
		return s;
	}
	
	public static void main(String[] args) {
		//test statements	
		Duration d = new Duration(2, 12);
		System.out.println(d);
	}
}