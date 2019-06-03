
public class TestCus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cus d1=new Cus();
		d1.jf=3050;
		d1.crd="金卡";
		
		d1.show();
		if(d1.jf>1000){
			System.out.println("回馈积分500分！");
		}
	}

}
