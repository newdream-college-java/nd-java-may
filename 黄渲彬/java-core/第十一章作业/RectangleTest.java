package demo05;

public class RectangleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		rectangle.length = 5;
		rectangle.width = 10;
		rectangle.move();
		rectangle.change();
		System.out.println(rectangle.kuan());
		System.out.println(rectangle.chang());
		System.out.println(rectangle.girth());
		System.out.println(rectangle.area());

	}

}
