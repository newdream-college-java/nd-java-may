
public class TestCar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car d1=new Car();
		d1.brand="布加迪威龙";
		d1.price=250000000;
		d1.colour="蓝色";
			System.out.println("品牌是："+d1.brand+"\t价格是："+d1.price+"\t颜色是："+d1.colour);
		d1.toString();
			System.out.println(d1.toString());
		d1.a();
		d1.b();
		d1.c();
	}

}
