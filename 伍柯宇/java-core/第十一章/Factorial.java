/*
 * 编写一个方法求n！
 * 
 */
public class Factorial{
	public int jiechen(int n){
		if(n<=1){
			return 1;
		}
		return n*jiechen(n-1);
	}
	
}