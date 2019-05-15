import java.util.Scanner;
public class To5{
	public static void main(String[] args){
		System.out.println("输入三个整数");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d;
		if(a>b){
			d=a;
			a=b;
			b=d;
		}
		if(a>c){
			d=c;
			c=a;
			a=d;
		}
		if(b>c){
			d=c;
			c=b;
			b=d;
		}
			System.out.println(a+"\t"+b+"\t"+c);



	}


}