package demo05;

public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carr car = new Carr();
		car.brand = "������";
		car.much = 10000000;
		car.color = "��ɫ";
		System.out.println(car.toString());
		System.out.println(car.pulseon());
		System.out.println(car.speed());
		System.out.println(car.Besold());
		
	}

}
