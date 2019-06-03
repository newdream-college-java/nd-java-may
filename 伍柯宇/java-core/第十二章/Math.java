
public class Math{
	public int a(int a,int b){
		int max=a>b?a:b;
		return max;
	}
	public int b(int a){
		int x=a%10;
		return x;
	}
	public int c(int a){
		int x=a*a*a;
		return x;
	}
	public int d(int a){
		int[] arr=new int[a];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=i;
		}
		return sum;
	}
}
