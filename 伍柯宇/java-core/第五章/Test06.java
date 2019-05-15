/*
编程使用 while 循环输出：100、95、90、85……、5。
*/

public class Test06{
	public static void main(String[] args){
		int sum=100,a=5;
		while(sum>5){
			sum-=a;
			
			System.out.println(sum);
		}
		
	}
}