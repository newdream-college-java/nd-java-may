
public class Loan {
	public void loan(int m,double x,int y){
		double i=m*x;//总利息
		double a=(i+m)/y;//月还款金额
		System.out.println("总利息为："+i+"月还款金额："+a);
	}
}
