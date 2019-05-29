
public class TestDemo05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Demo05 car = new Demo05();
			car.brand="天子驾二";
			car.price=500;
			car.color="灰色1";
			System.out.println(car.toString());
			car.start();
			car.quicken();
			car.sell();
	}

}
