/*
º∆À„ 1+1/4+1/9+....+1/(20*20)
*/

public class Test05{
	public static void main(String[] args){
		int i=1,n=20;
		double sum=0,t=0;
		while(i<=n){
			t=1.0/(i*i);
			sum=sum+t;
			i++;
		}
		System.out.println(sum);
	}
}