import java.util.Scanner;
public class To3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=a%10;  	//个位
		int c=a/10%10;	//十位
		int d=a/100%10;	//百位
		int e=a/1000;	//千位
		
		System.out.println(a+"\t"+b);
		System.out.println(a+"\t"+c);
		System.out.println(a+"\t"+d);
		System.out.println(a+"\t"+e);	
	}
}