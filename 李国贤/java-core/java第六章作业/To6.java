/*
计算 1*2*3*……*10 的结果。
*/
public class To6{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=10;i++){
			sum=i*(i+1);
		}
			System.out.println(sum);
	}
}