import java.util.Scanner;
public class To3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=a%10;  	//��λ
		int c=a/10%10;	//ʮλ
		int d=a/100%10;	//��λ
		int e=a/1000;	//ǧλ
		
		System.out.println(a+"\t"+b);
		System.out.println(a+"\t"+c);
		System.out.println(a+"\t"+d);
		System.out.println(a+"\t"+e);	
	}
}