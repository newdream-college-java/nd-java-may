/*
º∆À„ 1+1/4+1/9+....+1/(20*20)
*/
public class Test02{
	public static void main(String[] args){
		int i = 1,m = 0;
		double sum = 0 ;
		while(i<21){
			m = i * i;
			sum = sum + 1.0/m;
			i++;
		}
		System.out.println(sum);                   //1.5961632
	}
}