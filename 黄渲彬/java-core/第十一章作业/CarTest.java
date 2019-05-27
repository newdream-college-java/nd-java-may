package demo05;

public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carr car = new Carr();
		car.brand = "法拉利";
		car.much = 10000000;
		car.color = "红色";
		System.out.println(car.toString());
		System.out.println(car.pulseon());
		System.out.println(car.speed());
		System.out.println(car.Besold());
		
	}

}
