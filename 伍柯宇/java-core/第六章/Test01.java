/*
1.1、计算 100 以内的奇数之和
*/
public class Test01{
	public static void main(String[] args){
		int i=0,sum=0;
		for(i=0;i<=100;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}