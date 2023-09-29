public class Main {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("yellow");
		Car car3 = new Car(2019, "black");

		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());
	}
}