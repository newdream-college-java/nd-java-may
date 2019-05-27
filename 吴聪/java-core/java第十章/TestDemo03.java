
public class TestDemo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo03 oblong = new Demo03();
		oblong.length=10;
		oblong.width=5;
		oblong.move();
		oblong.change();
		oblong.info();
/*		oblong.chang();
		oblong.kuan();
		oblong.zc();
		oblong.mj();
*/	
		System.out.println(oblong.chang());
		System.out.println(oblong.kuan());
		System.out.println(oblong.zc());
		System.out.println(oblong.mj());
	}

}
