
public class TestRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle d1=new Rectangle();
		d1.length=5;
		d1.wide=2;
			System.out.println("�����εĳ�Ϊ��"+d1.length+"��Ϊ��"+d1.wide);
		d1.toString();
		d1.a();
		d1.b();
		d1.year();
		d1.mianJi();
		System.out.println("\t\n�����ε���Ϣ�ǣ�"+d1.toString()+"\t\n���ǣ�"+d1.a()+"\t\n���ǣ�"+d1.b()+"\t\n�ܳ��ǣ�"+d1.year()+"\t\n����ǣ�"+d1.mianJi());
	}

}
