/*
计算1+1/4+1/9+...+1/(20*20) 输出结果
*/
public class Test02{
	public static void main(String[] args){
		double a=0;
		int i=1;
//		double b=0;
		while(i<21){
			a=a+1.0/(i*i);
//			b=1.0/(i*i);
//			a=a+b;
			i++;
		}
		System.out.println(a);
//		System.out.print(b);
	}
}