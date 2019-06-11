
public class TestMaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths d1= new Maths();
		int[] a = d1.in();
		System.out.println("和为："+d1.s(a));
		System.out.println("最大值为："+d1.m(a));
	}

}
