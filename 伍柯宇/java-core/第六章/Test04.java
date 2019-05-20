/*
1.4、输出 10000-99999 里面的所有回文数。说明：例如：12321 是回文数，个位与
万位相同，十位与千位相同。12321 99999 99899
*/
public class Test04{
	public static void main(String[] args){
		for(int a=10000;a<=99999;a++){
			if(a%10==a/10000&&a/10%10==a/1000%10){
				System.out.println(a);
			}
		}
	}
}