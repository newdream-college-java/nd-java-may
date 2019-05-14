import java.util.Scanner;

public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("a=");
		int a = input.nextInt();
		System.out.print("b=");
		int b = input.nextInt();
		System.out.print("c=");
		int c = input.nextInt();
		int x;
		if(a>b){x=a;a=b;b=x;}
		if(b>c){x=b;b=c;c=x;}
		if(a>b){x=a;a=b;b=x;}
		System.out.println(a+"<"+b+"<"+c);

	}
}