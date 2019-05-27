
public class TestRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle d1=new Rectangle();
		d1.length=5;
		d1.wide=2;
			System.out.println("长方形的长为："+d1.length+"宽为："+d1.wide);
		d1.toString();
		d1.a();
		d1.b();
		d1.year();
		d1.mianJi();
		System.out.println("\t\n长方形的信息是："+d1.toString()+"\t\n长是："+d1.a()+"\t\n宽是："+d1.b()+"\t\n周长是："+d1.year()+"\t\n面积是："+d1.mianJi());
	}

}
