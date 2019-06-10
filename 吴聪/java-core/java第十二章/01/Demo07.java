/*  模拟一个简单的购物商贷月供计算器，假设按照以下的公式计算出总利息和每月还款
金 额。总利息=贷款金额*利率;月还款金额=(贷款金额+总利息)/贷款年限  */
public class Demo07 {
	public void shop(int dk,double ll,int nx){
		double zlx = 0;
		double yhk = 0;
		zlx=dk*ll;
		yhk=(dk+zlx)/nx;
		System.out.println(zlx);
		System.out.println(yhk);
	}
}