package day2;

public class TestDemo06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo06 dc = new Demo06();
		dc.brand="����";
		dc.gl=500;
		dc.xh="T-300";
		dc.cd();
		dc.fd();
		System.out.println(dc.pp());
		System.out.println(dc.Gl());
		System.out.println(dc.Xh());
		System.out.println(dc);
		dc.changeB("��ë��");
		dc.changeG(800);
		dc.changeX("T-200");
	}
}
