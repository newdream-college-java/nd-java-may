/*
输出计算 100+101+102+……+200 之和

*/
public class Test04{
		public static void main(String[] args){
			int a=100,sum=0;
			while(a<=200){
				sum+=a;
				a++;
			}
			System.out.println("100+101+102+……+200 之和等于"+sum);
		}
	}