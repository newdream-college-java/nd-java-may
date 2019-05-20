/*
1.6、计算 1*2*3*……*10 的结果
*/
public class Test06{
	public static void main(String[] args){
		int sum=1;
		for(int i=1;i<+10;i++){
			sum*=i;
		}
		System.out.println(sum);
	}
}