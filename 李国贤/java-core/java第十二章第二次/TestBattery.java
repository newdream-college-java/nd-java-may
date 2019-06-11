
public class TestBattery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battery d1 = new Battery();
		d1.brand="ÄÏæÚ";
		d1.gl=500;
		d1.xh="T-300";
		d1.cd();
		d1.fd();
		System.out.println(d1.pp());
		System.out.println(d1.Gl());
		System.out.println(d1.Xh());
		System.out.println(d1);
		d1.changeB("·ÉÃ«ÍÈ");
		d1.changeG(800);
		d1.changeX("T-200");
	}

}
