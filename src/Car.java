public class Car {

	private int year;
	private String color;

	public Car() {}

	public Car(int year, String color) {
		this.year = year;
		this.color = color;
	}

	public Car(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car{" +
				"year=" + year +
				", color='" + color + '\'' +
				'}';
	}
}
